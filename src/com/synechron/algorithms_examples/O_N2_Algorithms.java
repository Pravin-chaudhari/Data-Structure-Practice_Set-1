package com.synechron.algorithms_examples;


//O(N^2)
public class O_N2_Algorithms 
{
	public static void main(String[] args)
	{
		int n=5;
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
		    for (int j = 0; j < i; j++) 
		    {
		    	count++;
		        System.out.println("i:- "+i+", j:- "+j+"= Count:- "+count);
		    }
		}    	
	}
}
