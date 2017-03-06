package com.fmyblack.util.config;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {

	private static Logger logger = Logger.getLogger(Log4jDemo.class);
	
	public static void loadConfigure(String location) {
		PropertyConfigurator.configure(location);
	}
	
	public static void testLog() {
		if(logger.isDebugEnabled()) {
			logger.debug("this is debug level");
		}
		
		if(logger.isInfoEnabled()) {
			logger.info("this is info level");
		}
		
		logger.warn("this is warn level");
		logger.error("this is error level");
	}
	
	public static void main(String[] args) {
		String location = "src/main/resources/conf/log4j.properties";
		loadConfigure(location);
		testLog();
	}
}
