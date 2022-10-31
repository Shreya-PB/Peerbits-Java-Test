package com.example;

import java.util.Scanner;

/*Write a program to multiply two strings and produce a result as a string.
E.g. String A = 25 and string B = 125 , result = 3125. Don’t use string.parseInt or Integer.valueof functions.*/

public class MultiplyTwoStringNumbers {
	
	public static String getMultiplicationOfTwoStringNumber(String stringNumberOne,String stringNumberTwo) {
		
		return String.valueOf((Integer.decode(stringNumberOne)*Integer.decode(stringNumberTwo)));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter the String Number : ");
		
		String stringNumberOne = sc.next();
		
		System.out.print(" \n Please Enter the String Number : ");
		
		String stringNumberTwo = sc.next();
		
		System.out.println("Two String Number Multiplication is : "+stringNumberOne+" * "+stringNumberTwo+" = "
		+MultiplyTwoStringNumbers.getMultiplicationOfTwoStringNumber(stringNumberOne, stringNumberTwo));
				
	}

}
