package com.mvn.test;

import org.slf4j.*;
/**
 * Hello world!
 *
 */
public class App 
{

	public App () {
	}

	public boolean printFalse() {
		System.out.println( "Hello World from printFalse()" );
        	
		return false;
	}

	public boolean printTrue() {
        	System.out.println( "Hello World from printTrue()" );
		return true;
	}

	public boolean printToLoggerTrue() {
        	Logger logger = LoggerFactory.getLogger("esp"); 
		logger.info("Hello Logger from printToLoggerTrue()");
		return true;
	}


    public static void main( String[] args )
    {
    	System.out.println( "Here" );
    	
    	String strDisplay = "Hello World!";
        if (args!=null) {
        	for (String arg : args) {
        		strDisplay += " " + arg;  
        	}
        }
        System.out.println( "strDisplay [" + strDisplay + "]" );
        Logger logger = LoggerFactory.getLogger(App.class); 
        logger.info("Hello Logger");
    }
}
