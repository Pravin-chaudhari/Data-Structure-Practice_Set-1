package com.synechron.arrays_examples;

public class Largest_Sum_Contiguous_Sub_Array
{
	 static int maxSubArraySum(int a[]) 
	    { 
	        int size = a.length; 
	        int max_so_far = 0, max_ending_here = 0; 
	  
	        for (int i = 0; i < size; i++)  // 0 t, 1 t, 2 t, 3 t, 4 t, 5 t, 6 t, 7 t, 8 < 8 = condition false.
	        { 
	            max_ending_here = max_ending_here + a[i]; // -2, -3, 4, 3, 1, 2, 7, 4   
	            if (max_so_far < max_ending_here) // 0 < -2 f, 0 < -3 f, 0 < 4 t, 4 < 3 f, 4 < 1 f, 4 < 2 f, 4 < 7 t, 7 < 4 f 
	                max_so_far = max_ending_here;  // 4, 7
	            if (max_ending_here < 0) // -2 < 0 t, -3 < 0 t, 4 < 0 f, 3 < 0 f, 1 < 0 f, 2 < 0 f, 7 < 0 f, 4 < 0 f
	                max_ending_here = 0;  // 0, 0, 
	        } 
	        return max_so_far; // 7 
	    } 
	 
	 public static void main (String[] args) 
	    { 
	        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	        System.out.println("Maximum contiguous sum is " + 
	                                       maxSubArraySum(a)); // O/p = 7 
	    }   
}
