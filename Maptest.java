package com.kishore.collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maptest {

	public static void main(String[] args) {
		
		Map <Integer, String> intMap = new HashMap<>();
		Map <Integer, String> intLinkedMap = new LinkedHashMap<>();
		Map <Integer, String> intTreeMap = new TreeMap<>();
		
		System.err.println(" HashMap");
		intMap.put(1, "One");
		intMap.put(3, "Three");
		intMap.put(2, "Two");
	    
	    for(Integer key: intMap.keySet()){
	    
	    	String Hasvalue = intMap.get(key);
	    	
	    	System.out.println(Hasvalue);
	    }
	    
	   
	    intLinkedMap.put(5, "Five");
	    intLinkedMap.put(6, "Six");
	    intLinkedMap.put(4, "Four");
	    
	    System.err.println("Linked HashMap");
	    for(Integer linkMap: intLinkedMap.keySet())
	    {
	    	String value = intLinkedMap.get(linkMap);
	    	System.out.println(value);
	    }
	    
	    intTreeMap.put(5, "Five");
	    intTreeMap.put(6, "Six");
	    intTreeMap.put(4, "Four");
	    
	    System.err.println("Tree HashMap");
	    for(Integer treekMap: intTreeMap.keySet())
	    {
	    	String value = intTreeMap.get(treekMap);
	    	System.out.println(value);
	    }
	    
	    

	}
}
