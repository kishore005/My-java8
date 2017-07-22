package com.kishore.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	
	
	public static void main(String[] args) {
		List<String> names =  new ArrayList<String>();
		names.add("kishore0");
		names.add("kishore1");
		names.add("kishore2");
		names.add("kishore3");
		names.add("kishore4");
		
		for(String listofnames : names ){
			System.out.println(listofnames);
		}
		
		names.remove(0);
		System.out.println("After removing first string from ArrayList");
		for(String listofnames : names ){
			System.out.println(listofnames);
		}
		
		//COntains is a case sensitive
		boolean b = names.contains("kishore4");
		System.out.println("b==" +b);
		//Adding duplicate value to ArrayList
		names.add("kishore4");
		
		for(String listofnames : names ){
			System.out.println(listofnames);
		}
	
		//Creating a Integer ArrayList
		List<Integer> intArray =  new ArrayList<>();
		intArray.add(7);
		intArray.add(5);
		intArray.add(17);		
		intArray.add(1);		
		intArray.add(2);
		
		for(Integer myintList: intArray)
		{
			System.out.println(myintList);
			
		}
		
		//Creating a Integer LinkedList
		List<Integer> intLinkArray =  new LinkedList<>();
		intLinkArray.add(7);
		intLinkArray.add(5);
		intLinkArray.add(17);		
		intLinkArray.add(1);		
		intLinkArray.add(2);
		System.out.println("Linked List");
		for(Integer myintLinkedList: intLinkArray)
		{
			System.out.println(myintLinkedList);
			
		}
		
		
		
	}
	

}
