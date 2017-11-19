package com.java.concepts;

public class Wrapperclass {

	public static void main(String[] args) {
		// This example explains what is wrapper class and how is used ?
		// These are known as wrapper classes because they "wrap" the primitive data type into an object of that class. 
		//The wrapper classes are part of the java.lang package, which is imported by default into all Java programs.
		//There is no wrapper class for char datatype.
		
		
		String x = "25";
		int p = Integer.parseInt(x);
		System.out.println(p);
		
		
		int x1 =30;
		String q = String.valueOf(x1);
		System.out.println(p+q);
		System.out.println(p+x1);
		
		

	}

}
