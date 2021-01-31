package com.testing.test;
import java.lang.System.Logger.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.logging.*; 
import org.apache.log4j.*;




public class LogExample {
	
	private static final java.util.logging.Level TRACE = null;
	private static final java.util.logging.Level DEBUG = null;
	private static final java.util.logging.Level INFO = null;
	private static final java.util.logging.Level WARN = null;
	private static final java.util.logging.Level ERROR = null;
	private static final java.util.logging.Level FATAL = null;


	public static void printLevels(int num)
	{
		if(num==1)
			logger.setLevel(TRACE);
		if(num==2)
			logger.setLevel(DEBUG);
		if(num==3)
			logger.setLevel(INFO);
		if(num==4)
			logger.setLevel(WARN);
		if(num==5)
			logger.setLevel(ERROR);
		if(num==6)
			logger.setLevel(FATAL);
		
			
		logger.trace("Trace printed");
	    logger.debug("Debug printed");
	    logger.info("Info printed");
	    logger.warn("Warn printed");
	    logger.error("Error printed");
	    logger.fatal("Fatal printed");	
	}

	
	private static Logger logger = Logger.getLogger(LogExample.class.getName());
	
	
	public static void main(String[] args) throws SecurityException {
		  
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Tell the level of log you want to set");
		System.out.println("Enter a integer");
		System.out.println("Enter 1 for Trace");
		System.out.println("Enter 2 for Debug");
		System.out.println("Enter 3 for Info");
		System.out.println("Enter 4 for Warn");
		System.out.println("Enter 5 for Fatal");
		
		int x=sc.nextInt();
		
		printLevels(x);
		
		
		
	   }
}

