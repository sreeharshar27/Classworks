package com.hadoop.telcomSubscriber;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;

public class SubscriberMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	public void map(LongWritable key, Text value, Context con) throws IOException, InterruptedException {
		String line = value.toString();
		String[] words=line.split("[|]");
		
		if (words.length == 5 && "1".equals(words[4])) {					
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");			
			Date callStartTime = null;
			Date callEndTime = null;
			try {
				callStartTime = sdf.parse( words[2]);
				callEndTime = sdf.parse( words[3]);
			} catch (ParseException ex) {
				ex.printStackTrace();
			}
			
			long timeInmillis = callEndTime.getTime() - callStartTime.getTime();
			
			if (timeInmillis > 3600000) {
				Text outputKey = new Text(words[1].trim());
				IntWritable outputValue = new IntWritable(((int)(timeInmillis/60)));
				con.write(outputKey, outputValue);
			}			
		}
	}
}