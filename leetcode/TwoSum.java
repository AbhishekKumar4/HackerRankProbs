package com.abhishek;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
    	
    	for(int i = 0; i<nums.length;i++) {
    		for(int j = i+1 ; j<nums.length ;j++) {
    			if((nums[i] + nums[j])== target) {
    				System.out.println(i +":" +j);
    				return new int[] {i,j};
    			}
    		}
    	}
        throw new IllegalArgumentException("No Sum matched target!!!");
    }
    
    public static void main(String args[]) {
    	
    	int[] sample = {1,3,5,8};
    	System.out.println(twoSum(sample, 8));
    }
}
