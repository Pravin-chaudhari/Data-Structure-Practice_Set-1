package com.synechron.string_examples;

public class FirstUniqueCharcter
{
	public static char findFirstUniqueCharacter(String s)
	{
		//char character=0;
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			//character=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				//char ch=s.charAt(j);
				if(s.charAt(i)==s.charAt(j))
					count++;	
			}
			if(count<=1)
				return s.charAt(i);
		}
		return 0;
	}	
	public static void main(String[] args)
	{
		String str="Pravin ChaudharipV";
		System.out.println("First Unique Character of String Is:- "+findFirstUniqueCharacter(str.toUpperCase()));
	}

}
