package com.testing.test;

import javax.net.ssl.SSLEngine;

public class Calculator {
	
	Logic logic; // instance for logic
	
	//check if string is palindrome
		public int getIfPalindrome(String s)
		{
			int i=0;
			int j=s.length()-1;
			
			while(i<j)
			{
				if(s.charAt(i)!=s.charAt(j))
					return 0;
				
				i++;
				j--;
			}
			
			return 1;
			
		}
	
	// initializing logic instance
	public Calculator(Logic logic)
	{
		this.logic=logic;
	}
	
	public int getAddition(int a,int b)
	{
		return logic.add(a,b);
	}
	
	public int getMultiplication(int a,int b)
	{
		return logic.multiply(a,b);
	}
	
	public int getDivision(int a,int b)
	{
		return logic.divide(a,b);
	}
	
	public int getSubtraction(int a,int b)
	{
		return logic.subtract(a,b);
	}
	
	

}
