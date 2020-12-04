package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * @author Senhaji Houda
 *
 */

public class List2TreemapConversion {

	/**
	 * Convert an input list to a treemap
	 * @param inputlist the list containing symptoms duplicated and not in order
	 * @return the treeMap, the key is the symptom and the value is the number of occurences  
	 */
	
	public TreeMap<String, Integer> List2Treemap (List<String> inputlist) {
			
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();

			if(inputlist.isEmpty()) {
				
				System.out.println(" the list is empty");
			} else {
			
			for (int i=0; i<inputlist.size();i++) {
		
			
			if (map.containsKey(inputlist.get(i))) {// si le symptome existe dans la map j’incremente sa valeur
  
				map.put(inputlist.get(i),(map.get(inputlist.get(i))+1));
				System.out.println(" the symptom is already in the map , number of " +inputlist.get(i) +" " + map.get(inputlist.get(i)));
			}
			else // si le symptome n’existe pas dans la map, je met la valeur à 1
			{
				map.put(inputlist.get(i), 1);
				System.out.println("number of " +inputlist.get(i) +" " + map.get(inputlist.get(i)));

			}
			
		   }
			}
			return map;
			
			
	}
	
}
