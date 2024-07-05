package com.javaWrapperClasses;
//2] Write a program that demonstrates the use of wrapper classes to convert primitive 
//data types into objects and vice versa.

public class WrapperConversion {

	public static void main(String[] args) {
		// 1 Converting primitive to wrapper object
		int primitiveInt = 50;
		Integer wrapperInt = Integer.valueOf(primitiveInt); // Convert int to Integer

		double primitiveDouble = 3.14;
		Double wrapperDouble = Double.valueOf(primitiveDouble); // Convert double to Double

		char primitiveChar = 'V';
		Character wrapperChar = Character.valueOf(primitiveChar); // Convert char to Character

		// 2 Converting wrapper object to primitive
		int convertedInt = wrapperInt.intValue(); // Convert Integer to int
		double convertedDouble = wrapperDouble.doubleValue(); // Convert Double to double
		char convertedChar = wrapperChar.charValue(); // Convert Character to char

		// 3 Autoboxing (automatic conversion from primitive to wrapper)
		Integer autoboxedInt = primitiveInt; // Autoboxing int to Integer
		Double autoboxedDouble = primitiveDouble; // Autoboxing double to Double
		Character autoboxedChar = primitiveChar; // Autoboxing char to Character

		// 4 Unboxing (automatic conversion from wrapper to primitive)
		int unboxedInt = autoboxedInt; // Unboxing Integer to int
		double unboxedDouble = autoboxedDouble; // Unboxing Double to double
		char unboxedChar = autoboxedChar; // Unboxing Character to char

		// Print results
		System.out.println("Converted values:");
		System.out.println("wrapperInt: " + wrapperInt);
		System.out.println("wrapperDouble: " + wrapperDouble);
		System.out.println("wrapperChar: " + wrapperChar);
		System.out.println("convertedInt: " + convertedInt);
		System.out.println("convertedDouble: " + convertedDouble);
		System.out.println("convertedChar: " + convertedChar);
		System.out.println("autoboxedInt: " + autoboxedInt);
		System.out.println("autoboxedDouble: " + autoboxedDouble);
		System.out.println("autoboxedChar: " + autoboxedChar);
		System.out.println("unboxedInt: " + unboxedInt);
		System.out.println("unboxedDouble: " + unboxedDouble);
		System.out.println("unboxedChar: " + unboxedChar);
	}
}
