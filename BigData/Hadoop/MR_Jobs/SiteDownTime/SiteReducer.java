package com.hadoop.siteMaintenance;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class SiteReducer  extends Reducer<Text, IntWritable, Text, IntWritable>{
	
	public void reduce(Text phoneNumber, Iterable<IntWritable> values, Context con) throws IOException, InterruptedException {
		int sum = 0;
		for(IntWritable value : values){
		   sum += value.get();
		}
		con.write(phoneNumber, new IntWritable(sum));
	}

}