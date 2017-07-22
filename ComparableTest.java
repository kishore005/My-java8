package com.kishore.collection.Comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Draw back what if developer do not have access for Employee object ? At a time we can perform sorting logic on only one filed

class Employee implements Comparable<Employee>
{
	public Employee(int i, String string) {
		this.sno=i;
		this.name=string;
		
	}
	public int sno;
	public String name;
	@Override
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}
	
	
	public String toString()
	{
		return "(" +this.sno +"," + this.name +")";
	}
}

public class ComparableTest {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(4,"kishore"));
		empList.add(new Employee(1,"ramu"));
		empList.add(new Employee(2,"sandeep"));
		empList.add(new Employee(3,"aashrith"));
		
		System.out.println(empList);
		
		Collections.sort(empList);
		
		System.out.println(empList);

	}

}
