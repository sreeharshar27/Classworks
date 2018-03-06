package com.hadoop.telcomSubscriber;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.hadoop.wordcount.WordCountDriver;
import com.hadoop.wordcount.WordCountMapper;
import com.hadoop.wordcount.WordCountReducer;

public class SubscriberDriver {

	
	public static void main(String [] args) throws Exception
	{
		Configuration c=new Configuration();
		
		Path input=new Path(args[0]);
		Path output=new Path(args[1]);
		
		Job job = Job.getInstance();
		job.setJobName("Subscriber Job");

		job.setJarByClass(SubscriberDriver.class);
		
		//job.setInputFormatClass(TextInputFormat.class);   //default
		
		job.setMapperClass(SubscriberMapper.class);
		job.setReducerClass(SubscriberReducer.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, input);
		FileOutputFormat.setOutputPath(job, output);
		
		System.exit(job.waitForCompletion(true)?0:1);
	}
}