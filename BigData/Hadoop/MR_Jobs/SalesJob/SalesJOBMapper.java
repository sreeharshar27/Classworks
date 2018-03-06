package com.htc.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class SalesJOBMapper extends Mapper<LongWritable, Text, Text, IntWritable>{

	private final static IntWritable one = new IntWritable(1);

	public void map(LongWritable key, Text value, Context con) throws IOException, InterruptedException {

		String valueString = value.toString();
		String[] SingleCountryData = valueString.split(",");
		con.write(new Text(SingleCountryData[7]), one);
	}
	
}
