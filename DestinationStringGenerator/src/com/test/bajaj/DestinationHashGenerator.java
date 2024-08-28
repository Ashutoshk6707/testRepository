package com.test.bajaj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

public class DestinationHashGenerator {

	public static void main(String[] args) throws JSONException {
		if(args.length!=2) {
			System.out.println("Enter the Data in the Format as: java -jar DestinationHashGenerator.jar <PRN><JSON FILE PATH>");
			System.out.println("For Eg: java -jar test.jar 240350000046 path/to/file/test.json");		
		}
		String prnNo=args[0];
		String jsonFilePath=args[1];
		try {
			String jsonFile=new Scanner(new File(jsonFilePath)).useDelimiter("\\Z").next();
			JSONObject jsonObject=new JSONObject(jsonFile);			
			String destination= findFileDestination(jsonObject);
		}catch(FileNotFoundException e) {
			System.out.println("An Error Occured: "+e.getMessage());
			e.printStackTrace();
		}
		
		

	}
	private static String findFileDestination(Object json) {
		if(json instanceof JSONObject) {
			JSONObject jsonObject=(JSONObject)json;
		}
		return null;
	}

}
