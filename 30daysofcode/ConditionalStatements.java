package com.abhishek.thirtydaysofcode;

import java.util.Scanner;

public class ConditionalStatements {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        boolean isEven = true;
        if(N%2 !=0) {
        	isEven = false;
        }
        
        
        //If  is odd, print Weird
        if(isEven) {
        	System.out.println("Weird");
        }
        //If  is even and in the inclusive range of 2 to 5, print Not Weird
        if(isEven && (N <= 2 && N <= 5)) {
        	System.out.println("Not Weird");
        } 
        //If  is even and in the inclusive range of 6 to 20, print Weird
        if(isEven && (N <= 6 && N <=20)) {
        	System.out.println("Weird");
        }
        //If  is even and greater than , print Not Weird
        if(isEven &&  N > 20) {
        	System.out.println("Not Weird");
        }
    }
}
