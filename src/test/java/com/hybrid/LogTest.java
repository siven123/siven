package com.hybrid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class LogTest 
{
	static Log log = LogFactory.getLog(LogTest.class);
	
    public static void main( String[] args )
    {
        log.info( "Hello World! Log4j" );
    }
}
