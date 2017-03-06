package com.fmyblack.util.test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.fmyblack.util.io.TcpClient;

public class Test {
	static long i;
	final long l = i++;
	private int p = 5;
	
	private Test(String t) {
		
	}
	
	static {
		System.out.println("start test ----- + \n");
	}
	
    private void p() {
    		System.out.println("private method");
    }
	
    public String toString() {
    		return "return " + l;
    }
}
