package com.javaWrapperClasses;
//3] Write a program that demonstrates implicit and explicit type casting between different 
//primitive data types (int, double, float, long, etc.).

public class TypeCast {

	public static void main(String[] args) {
		// Implicit type casting (widening conversion)
		int intValue = 12;
		long longValue = intValue; // int to long (no explicit cast needed)
		float floatValue = intValue; // int to float (no explicit cast needed)
		double doubleValue = floatValue; // float to double (no explicit cast needed)

		System.out.println("Implicit type casting:");
		System.out.println("int to long: " + longValue);
		System.out.println("int to float: " + floatValue);
		System.out.println("float to double: " + doubleValue);

		// Explicit type casting (narrowing conversion)
		double anotherDoubleValue = 3.14;
		int anotherIntValue = (int) anotherDoubleValue; // double to int (explicit cast required)
		float anotherFloatValue = (float) anotherDoubleValue; // double to float (explicit cast required)
		System.out.println();
		System.out.println("Explicit type casting:");
		System.out.println("double to int: " + anotherIntValue);
		System.out.println("double to float: " + anotherFloatValue);
	}

}
