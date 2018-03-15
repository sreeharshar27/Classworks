package com.hadoop.siteMaintenance;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class SiteMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
	@Override
	protected void setup(
			Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		super.setup(context);
	}

	public void map(LongWritable key, Text value, Context con) throws IOException, InterruptedException {
	
		String line = value.toString();
		String[] words=line.split("[ ]");
		
		if (words.length == 10 && "200".equals(words[8])) {
			String time = words[3];
			String timezone = words[4];
			
			if (time != null && !time.isEmpty()) {
				time = time.substring(1, time.length());
			}
			
			if (timezone != null && !timezone.isEmpty()) {
				timezone = timezone.substring(0, timezone.length() - 1);
			}
			System.out.println("time --->" + time);
			System.out.println("timezone --->" + timezone);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:hh:mm:ssZ");
			SimpleDateFormat sdfHour = new SimpleDateFormat("HH");
			Date date = null;
			try {
				date = sdf.parse(time + timezone);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Text hour = new Text(sdfHour.format(date));
			con.write(hour, new IntWritable(1));
		}
		
	}

}