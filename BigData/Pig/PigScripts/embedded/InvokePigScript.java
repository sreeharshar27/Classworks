package com.htc.pig.embedded;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.pig.ExecType;
import org.apache.pig.PigServer;
import org.apache.pig.backend.executionengine.ExecException;


// Need httclient-4.2.5.jar  and  httpcore-4.2.5.jar in the build path.
// Location of Jars :   /usr/lib/hadoop/client

public class InvokePigScript {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		
	//	props.put("fs.defaultFS", "hdfs://quickstart.cloudera:8020");
		//props.put("mapreduce.jobtracker.address", "localhost:8021");
		//props.put("pig.use.overriden.hadoop.configs", true);
		
		try {
			
			PigServer pigserver = new PigServer(ExecType.MAPREDUCE, props);
			HashMap<String,String> params = new HashMap<String, String>();
			params.put("inputfile", "/piginputs/files.txt");
			
			pigserver.registerScript("src/wordcount.pig", params);

			//pigserver.registerScript("src/wordcount.pig");
			
		} catch (ExecException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
