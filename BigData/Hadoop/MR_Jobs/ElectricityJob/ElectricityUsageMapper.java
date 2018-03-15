package com.htc.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class ElectricityUsageMapper extends Mapper<LongWritable, Text, IntWritable, LongWritable>{

	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		
		String record = value.toString();
		String[] fields = record.split("[,]");
		
		int year = Integer.parseInt(fields[0]);
		long yearElectricityUsage = 0L;
		
		for(int i=2;i<fields.length;i++) {
			yearElectricityUsage += Integer.parseInt(fields[i]); 
		}
		context.write(new IntWritable(year), new LongWritable(yearElectricityUsage));
	}

}
