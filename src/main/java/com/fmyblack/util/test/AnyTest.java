package com.fmyblack.util.test;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class AnyTest {

	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		jo.put("a", "asd");
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("st", 23232l);
		map.put("ed", 243l);
		jo.put("ra", map);
		System.out.println(jo.toString());
	}
}
