package com.fmyblack.util.test;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class AnyTest {

	public static void main(String[] args) throws Exception {
		Class<?> vmClass = Class.forName("sun.misc.VM");
        long max = (Long) vmClass.getMethod("maxDirectMemory").invoke(null);
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().maxMemory());
	}
}
