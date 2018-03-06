package com.htc.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class ElectricityUsageReducer extends Reducer<IntWritable, LongWritable, IntWritable, LongWritable>{

	public void reduce(IntWritable key, Iterable<LongWritable> values, Context context) throws IOException, InterruptedException {
		
		long yearTotalElectricityUsage = 0L;
		
		for(LongWritable value : values) {
			yearTotalElectricityUsage += value.get();
		}
		context.write(key, new LongWritable(yearTotalElectricityUsage));
	}
	
}
