package com.synechron.algorithms_examples;


//N Log N Time Algorithms – O(nlogN)


public class N_Log_N_Time_Algorithms 
{

	public static void main(String[] args) 
	{
		int input = 8;
		
		for (int i = 1; i <= input; i++) //O(N) Liner
		{
		    for(int j = 1; j < 8; j = j * 2) //O(logN)
		    {
		        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
		    }
		}
	}
}
