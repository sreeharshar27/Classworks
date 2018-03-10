package com.htc.pig.udf;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class WordFirstLetterCapitalCase extends EvalFunc<String> {

	public String exec(Tuple input) throws IOException {

		try{
			if(input == null || input.size() ==0) 
				return null;
			else {
				String str = (String) input.get(0);
				String nameTrim = str.trim();
				StringBuffer buf = new StringBuffer(nameTrim.length());
		
				String[] words = nameTrim.split(" ");
				for(int i=0; i<words.length; i++) {
					buf.append(Character.toUpperCase(words[i].charAt(0)));
					buf.append(words[i].substring(1).toLowerCase());
					buf.append(" ");
				}
				return buf.toString();

			}
		}
		catch(Exception ex) {
			throw new IOException();	
		}
	}		
}