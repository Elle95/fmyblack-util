package com.fmyblack.util.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AsMain {

	static Test callHiddenConstructor() {
		Class c = Test.class;
		try {
			Constructor c0 = c.getDeclaredConstructor(String.class);
			c0.setAccessible(true);
			return (Test) c0.newInstance(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	static void callHiddenMethod(Object o, String methodName) {
		try {
			Method g = o.getClass().getDeclaredMethod(methodName);
			g.setAccessible(true);
			g.invoke(o);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void printHiddenField(Object o, String fieldName) {
		try {
			Field f = o.getClass().getDeclaredField(fieldName);
			f.setAccessible(true);
			System.out.println("private field f:\t" + f.getInt(o));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Test t = callHiddenConstructor();
		callHiddenMethod(t, "p");
		printHiddenField(t, "p");
	} 
}
