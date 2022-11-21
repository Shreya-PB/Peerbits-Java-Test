package com.example;

import java.util.Scanner;

/*Write a program to multiply two strings and produce a result as a string.
E.g. String A = 25 and string B = 125 , result = 3125. Don’t use string.parseInt or Integer.valueof functions.*/

public class MultiplyTwoStringNumbers {

    private static String convertIntegerToString(int result) {

        String res = "";

        while (result > 0) {
            int digitValue = result % 10;
            char digit = (char) ('0' + digitValue);
            res = digit + res;
            result = result / 10;
        }

        return res;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the First Number : ");

        String number1 = sc.next();

        System.out.print(" \n Please Enter the Second Number : ");

        String number2 = sc.next();

        String output = "0";
        if (number1.equalsIgnoreCase("0") || number1.equalsIgnoreCase("0")) {
            System.out.println("Two String Number Multiplication is : " + number1 + " * " + number2 + " = "
                    + output);
            return;
        }

        output = convertIntegerToString(convertStringToInteger(number1) * convertStringToInteger(number2));

        System.out.println("Two String Number Multiplication is : " + number1 + " * " + number2 + " = "
                + output);

    }

    private static int convertStringToInteger(String number) {

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {

            sum = (sum * 10) + (number.charAt(i) - '0');
        }
        return sum;
    }

}
