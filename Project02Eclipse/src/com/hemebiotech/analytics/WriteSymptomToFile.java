package com.hemebiotech.analytics;

import java.io.File;
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
	public void generateSymptomFile(TreeMap<String, Integer> map) {
	
		try {
		
		File file = new File("Project02Eclipse\\result.out");
		       
	    if (file.createNewFile()){
		    System.out.println("File created!");
		}else{
		     System.out.println("File already existe.");
		     }	
			
		

	    FileWriter writer = new FileWriter (file);	
		
	    for (Map.Entry m : map.entrySet()) {
	           
			writer.write( m.getKey() +" = " +m.getValue()   + "\n"); 
        }
		
		writer.close();
		} catch (IOException exception) {
			System.out.println(" Can't access to the file ");
		}	
		
	}
	
}
