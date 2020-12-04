package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	
	    public static void main(String args[]) throws Exception {
		//public static void main(String args[])  {
	
		
		ReadSymptomDataFromFile reader  = new ReadSymptomDataFromFile("Project02Eclipse\\\\symptoms.txt");
		List2TreemapConversion listconv = new List2TreemapConversion();
		WriteSymptomToFile writer = new WriteSymptomToFile();
		//TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		//lit le fichier symptoms.txt et stock les symptomes dans une liste
		List<String> result = reader.GetSymptoms();
		//convertie la liste en TreeMap ordonn�e avec pour chaque symptome son nombre d'occurence
		TreeMap<String, Integer> map = listconv.List2Treemap (result);
		// genere le fichier result.out � partir de la TreeMap
		writer.GenerateSymptomFile(map);
							
	}
}
