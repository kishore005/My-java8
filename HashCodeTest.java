package com.kishore.collection.HashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Employee{
	private int id;
	private String name;
	
	
	
	public Employee(int id , String name)
	{
		this.id = id;
		this.name=name;
	}
	public String toString(){
		return "(ID  is : " +id +",name = " +name +")";
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	
	
}

public class HashCodeTest {

	public static void main(String[] args) {

		
/*		Map <Integer, String> intMap = new HashMap<>();
		
		System.err.println(" HashMap");
		intMap.put(1, "One");
		intMap.put(3, "Three");
		intMap.put(2, "Two");
		intMap.put(1, "One");
		
		for(Integer hasVal: intMap.keySet())
		{
			String value = intMap.get(hasVal);
			System.out.println("key = " +hasVal +"value="  +value);
			
		}
		
		
			System.out.println("Set1");
		
		Set <String> setValue1 = new HashSet<>();
		
		setValue1.add("one");
		setValue1.add("two");
		setValue1.add("three");
		setValue1.add("one");
		
		System.out.println("set" +setValue1);*/
		
		
		
		
		
	Employee e1 = new Employee(1, "one");
	Employee e2 = new Employee(2, "two");
	Employee e3 = new Employee(3, "three");
	Employee e4 = new Employee(1, "one");
		
		
		
       Map <Employee , String> empMap = new HashMap<>();
		
		System.err.println(" HashMap");
		empMap.put(e1, "one");
		empMap.put(e2,"two");
		empMap.put(e3, "three");
		empMap.put(e4, "one");		
		for(Employee hasVal: empMap.keySet())
		{
			String value = empMap.get(hasVal);
			System.out.println("key = " +hasVal +"value="  +value);
			
		}
		
		
			System.out.println("Set1");
		
		Set <Employee> setValue1 = new HashSet<>();
		
		setValue1.add(e1);
		setValue1.add(e2);
		setValue1.add(e3);
		setValue1.add(e4);
		
		System.out.println("set" +setValue1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
/*	 Normal Out put
     HashMap
	 key = 1value=One
	 key = 2value=Two
	 key = 3value=Three
	 Set1
	 set[one, two, three]*/
}
