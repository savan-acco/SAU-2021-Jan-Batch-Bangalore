package com.testing.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapyearTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testleapYearCheck() {
		
		boolean val1=(new Leapyear()).leapYearCheck(2016);
		assertEquals(true,val1);
		
		boolean val2=(new Leapyear()).leapYearCheck(2000);
		assertSame(val2, true);
		
		boolean val3=(new Leapyear()).leapYearCheck(800);
		assertEquals(true,val3);
		
		boolean val4=(new Leapyear()).leapYearCheck(1016);
		assertTrue(val4==true);

		boolean val5=(new Leapyear()).leapYearCheck(2013);
		assertNotSame(true,val5);

		boolean val6=(new Leapyear()).leapYearCheck(-13);
		assertNotSame(true,val6);
		
	}
	

}
