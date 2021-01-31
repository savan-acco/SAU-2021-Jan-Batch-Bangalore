package com.testing.test;

public class Leapyear {

	public boolean leapYearCheck(int year)
	{
			// multiple of 400 is a leap year
		 	if(year%400==0) 
		      return true; 
		 
		 	// multiple of 100 is not a leap year
		    if (year % 100 == 0) 
		        return false; 
		    
		    //multiples of 4 are leap year
		    if (year % 4 == 0) 
		        return true; 
		    else
		    return false; //else not a leap year
	}
	
}
