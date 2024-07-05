package com.javaWrapperClasses;
//5 ]Write a program that demonstrates autoboxing (automatic conversion of primitives 
//to wrapper classes) and unboxing (automatic conversion of wrapper classes to primitives)
// in Java.
public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// Autoboxing: Converting primitives to wrapper classes
		int primitiveInt = 12;
		Integer wrapperInt = primitiveInt;
		double primitiveDouble = 3.14;
		Double wrapperDouble = primitiveDouble;

		char primitiveChar = 'A';
		Character wrapperChar = primitiveChar;

		System.out.println("Autoboxing:");
		System.out.println("wrapperInt: " + wrapperInt);
		System.out.println("wrapperDouble: " + wrapperDouble);
		System.out.println("wrapperChar: " + wrapperChar);

		// Unboxing: Converting wrapper classes back to primitives
		int unboxedInt = wrapperInt;
		double unboxedDouble = wrapperDouble;
		char unboxedChar = wrapperChar;

		System.out.println();
		System.out.println("Unboxing:");
		System.out.println("unboxedInt: " + unboxedInt);
		System.out.println("unboxedDouble: " + unboxedDouble);
		System.out.println("unboxedChar: " + unboxedChar);
	}
}
