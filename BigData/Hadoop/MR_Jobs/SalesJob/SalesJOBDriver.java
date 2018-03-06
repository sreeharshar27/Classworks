package com.htc.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class SalesJOBDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
	
		Configuration c=new Configuration();
		Path input=new Path(args[0]);
		Path output=new Path(args[1]);
		
		Job job = Job.getInstance();
		job.setJobName("Products Count By Country");
		job.setJarByClass(SalesJOBDriver.class);
		job.setMapperClass(SalesJOBMapper.class);
		job.setCombinerClass(SalesJOBReducer.class);
		job.setReducerClass(SalesJOBReducer.class);
		
		//job.setInputFormatClass(TextInputFormat.class); //default
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, input);
		FileOutputFormat.setOutputPath(job, output);
		
		System.exit(job.waitForCompletion(true)?0:1);
	}

}