package com.synechron.algorithms_examples;

public class O_MN_Algorithms 
{
	public static void main(String[] args) 
	{
	    int n=3;
	    int m=5;
		for (int i = 1; i <= n; i++) //O(n)
		{
		    for(int j = 1; j < m; j++) //O(m) = O(nm)
		    {
		        System.out.println("  " + i + " and " + j);
		    }
		}	
	}
}
