package com.javaWrapperClasses;
//1] Write a program that creates an array of double values and then converts each element
//to an integer array using explicit type casting.

public class DoubleToIntArrayConversion {

	public static void main(String[] args) {

		double[] doubleValues = { 3.40, 2.31, 1.18, 4.430, 0.4 };

		int[] intValues = new int[doubleValues.length];

		for (int i = 0; i < doubleValues.length; i++) {
			intValues[i] = (int) doubleValues[i];
		}
		
		System.out.print("Original double values: ");
		for (double value : doubleValues) {
			System.out.print(value + " ");
		}
		System.out.println();

		System.out.print("Converted integer values: ");
		for (int value : intValues) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}