package com.synechron.arrays_examples;


//O(N^2)

public class Find_SubArray_Given_sum 
{
	    int subArraySum(int arr[], int n, int sum)  
	    { 
	        int curr_sum, i, j; 
	        for (i = 0; i < n; i++)  //O(N)
	        { 
	            curr_sum = arr[i];  //1- 15 , 2- 23 
	            for (j = i + 1; j <= n; j++)  //O(N^2)
	            { 
	                if (curr_sum == sum)  //1 15==23 f, 2- 23==23 t 
	                { 
	                    int p = j - 1;  // 2-1= 1
	                    System.out.println("Sum found between indexes " 
	                                       + i + " and " + p);  // 1 to 1
	                    return 1; 
	                } 
	                if (curr_sum > sum || j == n) //1 (15 > 23 || 1 == 9)
	                    break; 
	                curr_sum = curr_sum + arr[j]; //1 15+23=38, 
	            } 
	        }  
	        System.out.println("No subarray found"); 
	        return 0; 
	    }
	    public static void main(String[] args)  
	    { 
	    	Find_SubArray_Given_sum arraysum = new Find_SubArray_Given_sum(); 
	        int arr[] = {15,23,2, 4, 8, 9, 5, 10, 14}; 
	        int n = arr.length; 
	        int sum = 23; 
	        arraysum.subArraySum(arr, n, sum); 
	    } 
}
