package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	
	    public static void main(String args[]) throws Exception {
	
		
		ReadSymptomDataFromFile reader  = new ReadSymptomDataFromFile("Project02Eclipse\\\\symptoms.txt");
		List2TreemapConversion listconv = new List2TreemapConversion();
		WriteSymptomToFile writer = new WriteSymptomToFile();
		
		//lit le fichier symptoms.txt et stock les symptomes dans une liste
		List<String> result = reader.getSymptoms();
		//convertie la liste en TreeMap ordonnée avec pour chaque symptome son nombre d'occurence
		TreeMap<String, Integer> map = listconv.list2Treemap (result);
		// genere le fichier result.out à partir de la TreeMap
		writer.generateSymptomFile(map);
							
	}
}
