package com.kishore.collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		System.out.println("Set1");
		
		Set <String> setValue1 = new HashSet<>();
	/*	Set <String> linkedSetValue = new LinkedHashSet<>();
		Set <String> treeSetValue = new TreeSet<>();*/
		
		setValue1.add("a");
		setValue1.add("b");
		setValue1.add("c");
		setValue1.add("d");
		setValue1.add("d");
	for(String extractSet : setValue1) 
	{
		System.out.println(extractSet);
	}
	
	
	
	System.out.println("Set2");
	Set <String> setValue2 = new HashSet<>();
	/*	Set <String> linkedSetValue = new LinkedHashSet<>();
		Set <String> treeSetValue = new TreeSet<>();*/
		
		setValue2.add("e");
		setValue2.add("f");
		setValue2.add("c");
		setValue2.add("d");
	
		for(String set2 : setValue2)
		{
			System.out.println(set2);
		}
	
		
		
		
		Set <String> intersection = new HashSet<>(setValue1);
		
		intersection.retainAll(setValue2);
		System.out.println("Intersection");
		for(String extracinterSectiontSet : intersection)
		{
			System.out.println(extracinterSectiontSet);
		}
		
		
		
		Set <String> difference = new HashSet<>(setValue1);
		difference.removeAll(setValue2);
		System.out.println("Difference");
		for(String extracdifferetSet : difference)
		{
			System.out.println(extracdifferetSet);
		}
	
	}
	

}
