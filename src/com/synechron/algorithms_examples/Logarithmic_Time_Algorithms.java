package com.synechron.algorithms_examples;


//Logarithmic Time Algorithms – O(logN)


public class Logarithmic_Time_Algorithms 
{

	public static void main(String[] args) 
	{
		int input = 8;
		for (int i = 1; i < input; i = i * 2) //O(logN)
		{
		    System.out.println("Hey - I'm busy looking at: " + i);
		}
	}

}
