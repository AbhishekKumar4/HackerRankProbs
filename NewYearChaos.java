package com.abhishek.interviewprepkit;

import java.util.Scanner;

public class NewYearChaos {

	 // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int bribe = 0;
    	for(int i  = q.length-1 ; i >= 0; i--) {
    		int tempBribe = 0;
    		if(q[i] != i+1) {
    			for(int j = i ; j>=0 ; j--) {
    				tempBribe++;
    				if(q[j] ==q[i]) {
    					break;
    				}
    				if(tempBribe > 2) {
    					System.out.println("Too chaotic");
    				}
    			}
    		}
    		bribe = bribe + tempBribe;
    	}

    }
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
