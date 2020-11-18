package org.adactinhotelapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurence {
	public static void main(String[] args) {
		String s = "java java enna java selenium";
		
		Map<String, Integer> mp = new HashMap<>();
		
		String[] split = s.split(" ");
		
		for (String word : split) {
			
			if (mp.containsKey(word)) {
				Integer integer = mp.get(word);
				
				mp.put(word, integer+1);
				
			} 
			else  {
				mp.put(word, 1);
			}
		}
		Set<Entry<String, Integer>> entry = mp.entrySet();
		System.out.println(entry);
		for (Entry<String, Integer> entries : entry) {
			Integer value = entries.getValue();
			
			if(value>1) {
				System.out.println(entries);
			}
		}
		
	}

}
