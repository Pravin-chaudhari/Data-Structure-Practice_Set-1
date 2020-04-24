package com.synechron.arrays_examples;

public class SecondLargestNumber 
{
	
	public static int secondLargest(int[] number)
	{
		
		int largest=number[0];
		int secondLarg =number[0];
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>largest)
			{
				secondLarg=largest;
				largest=number[i];
			}
		}	
		return secondLarg;
	}
	public static void main(String[] args) 
	{
		int[] number = {4,6,7,10,65,84,0,25,90};
		System.out.println("Second Largest Number in Array Is:- "+secondLargest(number));
		//Output :- 84
	}

}
