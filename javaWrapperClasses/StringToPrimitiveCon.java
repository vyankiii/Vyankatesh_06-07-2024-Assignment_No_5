package com.javaWrapperClasses;
//4] Create a program that uses various methods from wrapper classes 
//(e.g., Integer.parseInt(), Double.valueOf(), Boolean.toString()) to convert strings to primitive types and back
public class StringToPrimitiveCon {

	public static void main(String[] args) {

		// Convert strings to primitive types
		String string = "555";
		int parseInt = Integer.parseInt(string);

		String doubleString = "6.44";
		double parseDouble = Double.valueOf(doubleString);

		String booleanString = "true";
		boolean parseBoolean = Boolean.parseBoolean(booleanString);
		System.out.println("Parsed int: " + parseInt);
		System.out.println("Parsed double: " + parseDouble);
		System.out.println("Parsed boolean: " + parseBoolean);

		// Convert primitive to strings
		String intAsString = Integer.toString(parseInt);
		String doubleAsString = Double.toString(parseDouble);
		String booleanAsString = Boolean.toString(parseBoolean);

		System.out.println("Int as string: " + intAsString);
		System.out.println("Double as string: " + doubleAsString);
		System.out.println("Boolean as string: " + booleanAsString);
	}
}
