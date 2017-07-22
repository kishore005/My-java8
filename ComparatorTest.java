package com.kishore.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Draw back what if developer do not have access for Employee object ? need to add sort logic for each field
//Githib Test

class Employee
{
	public Employee(int i, String string) {
		this.sno=i;
		this.name=string;
		
	}
	public int sno;
	public String name;

	
	
	public String toString()
	{
		return "(" +this.sno +"," + this.name +")";
	}
}

public class ComparatorTest {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(4,"kishore"));
		empList.add(new Employee(1,"ramu"));
		empList.add(new Employee(2,"sandeep"));
		empList.add(new Employee(3,"aashrith"));
	
		System.out.println("Initial List");
		System.out.println(empList);
		System.out.println("Sorting with SNo");
		Collections.sort(empList, new EmployeeSnoComparator());
		System.out.println(empList);
		System.out.println("Sorting with Names");
		Collections.sort(empList, new EmployeeNameComparator());
		System.out.println(empList);
		
		
	}

}
class EmployeeSnoComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.sno-o2.sno;
	}
	
	
}

class EmployeeNameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
	
}