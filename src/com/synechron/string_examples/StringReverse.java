package com.synechron.string_examples;

public class StringReverse
{
	// String Reverse using Recursive Function.
	static String result="";
	public static String reverseRecursiveFunction(String reverse)
	{	
		 if (reverse.length() <= 0) 
			return result;
		else
		{
			result=result+reverse.charAt(reverse.length()-1); //
			reverseRecursiveFunction(reverse.substring(0,reverse.length()-1));
		}
		
		return result;
	}
	
	// String Reverse using Normal Method.
	public static String reverseString(String s)
	{
		 String output="";
		  for(int i=s.length()-1;i>=0;i--)
		  {
			  output=output+s.charAt(i); 
		  }
		 
		return output;
	}
	public static void main(String[] args) 
	{
		String str="Wel-come to Java Developement";
		System.out.println("String Reverse using Recursive Function:- "+reverseRecursiveFunction(str));
		
		String inputString="Pravin Chaudhari";
		System.out.print("String Reverse Using Normal Method Result is:- "+reverseString(inputString));
	}
}
