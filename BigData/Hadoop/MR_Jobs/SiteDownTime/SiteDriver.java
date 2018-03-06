package com.hadoop.siteMaintenance;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class SiteDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration c=new Configuration();
		
		Path input=new Path(args[0]);
		Path output=new Path(args[1]);
		
		Job job = Job.getInstance();
		job.setJobName("Web Traffic Job");

		job.setJarByClass(SiteDriver.class);
		
		//job.setInputFormatClass(TextInputFormat.class);   //default
		
		job.setMapperClass(SiteMapper.class);
		job.setReducerClass(SiteReducer.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, input);
		FileOutputFormat.setOutputPath(job, output);
		
		System.exit(job.waitForCompletion(true)?0:1);
	}
}