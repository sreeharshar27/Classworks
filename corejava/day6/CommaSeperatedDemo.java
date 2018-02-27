package com.htc.corejava.day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class CommaSeperatedDemo {

	public static Logger logger = Logger.getLogger(CommaSeperatedDemo.class);
	
	public static void writeFormattedRecord(List<PolicyInfo> policyList){
		
		try {
			
			PrintWriter pw = new PrintWriter(new FileWriter("myfolder"+File.separator+"policyreport"));
			
			pw.printf("%70s\n","Policy Information Report");
			pw.printf("%70s\n\n","=========================");
			pw.printf("%120s\n\n", "Date: 10-10-2018" );
			pw.printf("%20s %-30s %15s %15s\n", "--------", "-------------------", "----------", "--------" );
			pw.printf("%20s %-30s %15s %15s\n", "PolicyNo", "Policy Holder Name", "Issue Date", "Premium" );
			pw.printf("%20s %-30s %15s %15s\n", "--------", "-------------------", "----------", "--------" );
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			for(PolicyInfo p : policyList) {
				pw.printf("%20s %-30s %15s %15s\n", p.getPolicyNo(), p.getPolicyHolderName(), sdf.format(p.getIssueDate()), p.getPremium());
			}
			
			pw.close();
			logger.info("File closed");
		} catch (IOException e) {
			
			logger.error("Error :"+ e.toString());
		}
	}
	
	public static void main(String[] args) {
	
		List<PolicyInfo> policyList = new ArrayList<PolicyInfo>();
		
		File file = new File("myfolder"+ File.separator + "policyinfo");
		BufferedReader br= null;
		try {
			br  = new BufferedReader(new FileReader(file));
			
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				
				String[] policyFields = line.split(",");
				if(policyFields.length == 4){ //If any field is missing we are rejecting those records.
					
					String policyNo          = policyFields[0];
					String policyHolderName  = policyFields[1];
					String issueDate         = policyFields[2];
					String premium           = policyFields[3];

					// Validate the fields here..
					logger.info("Validation completed");
					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				
					policyList.add(new PolicyInfo(policyNo, policyHolderName, sdf.parse(issueDate), Double.parseDouble(premium)));
				}
			}
			
			//Printing policyInfo objects..
			for(PolicyInfo p : policyList){
				System.out.println(p);
			}
			logger.info("Policy Recorded loaded successfylly");
			writeFormattedRecord(policyList);
			
		} catch (FileNotFoundException e) {
			logger.error(e.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			logger.warn(e.toString());
		} catch (ParseException e) {
			logger.error(e.toString());
		}
		finally{
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
