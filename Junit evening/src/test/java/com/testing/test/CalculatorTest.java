package com.testing.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class CalculatorTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	
	Calculator c=null;
	Logic obj=Mockito.mock(Logic.class);
	
	@Before
	public void initializer()
	{
		c=new Calculator(obj);
	}
	
	@Test
	public void checkingAddition()
	{
		when(obj.add(2, 8)).thenReturn(10);
		assertEquals(10,c.getAddition(2, 8));
		verify(obj).add(2,8); //verify to check if add() method is used
	}
	
	@Test
	public void checkingDivision()
	{
		when(obj.divide(40, 8)).thenReturn(5);
		assertEquals(5,c.getDivision(40, 8));
		verify(obj).divide(40,8); //verify to check if divide() method is used
	}
	
	@Test
	public void checkingMultiplication()
	{
		when(obj.multiply(2,10)).thenReturn(20);
		assertEquals(20,c.getMultiplication(2,10));
		verify(obj).multiply(2,10); //verify to check if multiply() method is used
	}
	
	@Test
	public void checkingSubtraction()
	{
		when(obj.subtract(4,1)).thenReturn(3);
		assertEquals(3,c.getSubtraction(4,1));
		verify(obj).subtract(4,1); //verify to check if subtract() method is used
	}
	
	@Test
	public void checkingPalindrome()
	{
		
		assertEquals(1,c.getIfPalindrome("abccba"));
		//check for palindrome
	}
	
	@After
	public void lastStep()
	{
		System.out.println("DONE");
	}
	
	
}
