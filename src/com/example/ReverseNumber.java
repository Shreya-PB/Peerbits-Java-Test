package com.example;

/*Write a program to reverse the integer, 
you cannot convert integer to string and cannot use int.parse function.*/

import java.util.Scanner;

public class ReverseNumber {
	
	
	public static int generateReverseNumber(int number) {
		
		int reverse=0,reminder;
		
		
		while(number>0) {
			
			reminder = number%10;
			reverse = (reverse*10)+reminder;
			number = number/10;
		}
		
		return reverse;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter the Number : ");
		
		int num = sc.nextInt();
		
		System.out.println("The Reverse Number is : "+ReverseNumber.generateReverseNumber(num));
		
	}

}
