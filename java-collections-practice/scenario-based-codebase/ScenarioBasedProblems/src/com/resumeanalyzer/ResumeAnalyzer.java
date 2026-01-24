package com.resumeanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResumeAnalyzer {
	public static void main(String[] args) {
		File folder = new File("C:/Users/saqui/Desktop/Java programming workspace/java-collections-practice/scenario-based-codebase/ScenarioBasedProblems/src/com/resumeanalyzer/Resumes");
		File[]files = folder.listFiles();
		HashMap<String, ResumeData>map=new HashMap<String, ResumeData>();
		String regexEmailString ="[a-zA-Z0-9._%+-]+@[a-zA-z0-9.-]+\\.[a-zA-Z]{2,}";
		String regexPhoneString ="(\\+91[-]?)?[6-9]\\d{9}";
		
		Pattern pattern;
		Matcher matcher;

		for(File file : files) {
			try(BufferedReader br=new BufferedReader(new FileReader(file))) {
				String line;
				ResumeData rd=new ResumeData();
				while ((line=br.readLine())!=null) {
					pattern=Pattern.compile(regexEmailString);
					matcher=pattern.matcher(line);
					if (matcher.find()) {
						rd.setEmail(matcher.group());
						map.put(rd.getEmail(), rd);
					}
					pattern=Pattern.compile(regexPhoneString);
					matcher=pattern.matcher(line);
					if (matcher.find()) {
						rd.setPhone(matcher.group());
					}
					
				}
			} catch (Exception e) {
				System.out.println("unKnown Exception Occured ..!!");
			}
			
		}
		
		for(ResumeData rData :map.values()) {
			System.out.println(rData);
		}
		
	}
	}
