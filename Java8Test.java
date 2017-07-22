package com.kishore.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*class  Consumertest implements Consumer<Integer> 
{

	@Override
	public void accept(Integer t) {
		System.err.println("int value = " +t);
		
	}
	
}*/

@FunctionalInterface
interface ExceptionInterface
{
	void  add();
	
}

public class Java8Test{
	
	
		public static void main(String[] args) {
			
			
			
			
			
			
			//Java 7
			ExceptionInterface exceptionInterface= new ExceptionInterface() {
				
				@Override
				public void add() {
					System.err.println("kishore");
					
				}
			};
			exceptionInterface.add();
			//Java 8 Lamda
			ExceptionInterface exceptionInterface1;
			
			exceptionInterface1=()->System.err.println("iam java 8");
			
			
			exceptionInterface1.add();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		//List<Integer> intList= new ArrayList<>();
			
		
		
/*		List<Integer> intList=Arrays.asList(1,2,3,4,5);
		
		
		System.err.print("Traditional  for loop");
		for(int i=0;i<intList.size();i++)
		{
		System.err.print(intList.get(i));	 
		}
		System.err.println(" \n"+"Enhansed for loop");
		for(int i:intList)
		{
			System.err.print(i);
		}
		System.err.println("Foreach for loop");
		
		intList.forEach(i->System.err.print(i));*/
			//********************************************************************************************************************************
		
		

		
		
		//********************************************************************************************************************************
	
		
		
	/*	Consumer<Integer> c1 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.err.println(t);
				
			}
		};*/
	
		

				
			
	  /*  List<Integer> intList=Arrays.asList(1,2,3,4,5);
		intList.forEach(t-> System.err.println(t));*/
		
		
		
		
	}

		

}
