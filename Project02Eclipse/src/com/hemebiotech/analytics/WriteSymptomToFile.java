package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Senhaji Houda
 *
 */

public class WriteSymptomToFile {
	
/**
 * Generate the file result.out that contains all symptoms not duplicated and in order
 * @param map: treeMap, the key is the symptom and the value is the number of occurences
 */
	public void GenerateSymptomFile(TreeMap<String, Integer> map) {
	
		try {
		FileWriter writer = new FileWriter ("Project02Eclipse\\result.out");

			
		for (Map.Entry m : map.entrySet()) {
	           
			writer.write( m.getKey() +" = " +m.getValue()   + "\n"); 
        }
		
		writer.close();
		} catch (IOException exception) {
			System.out.println(" Can't access to the file ");
		}	
		
	}
	
}
