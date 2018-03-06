package com.htc.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class SalesJOBReducer  extends Reducer<Text, IntWritable, Text, IntWritable>{

	public void reduce(Text country, Iterable<IntWritable> values, Context con) throws IOException, InterruptedException {
	
		Text key = country;
		int frequencyForCountry = 0;
		for(IntWritable value : values) {
			// replace type of value with the actual type of our value
			frequencyForCountry += value.get();
		}
		con.write(key, new IntWritable(frequencyForCountry));
	}
}
