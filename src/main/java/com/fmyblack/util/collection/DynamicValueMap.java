package com.fmyblack.util.collection;

import java.util.HashMap;
import java.util.Map;

public class DynamicValueMap {

	static Map<String, DynValue> map = new HashMap<String, DynValue>();
	
	public static void main(String[] args) {
		DynValue d = new DynValue(10);
		map.put("w", d);
		System.out.println(map.get("w"));
		d.setI(11);
		System.out.println(d);
		System.out.println(map.get("w"));
		System.out.println(map.get("w") == d);
		map.put(null, null);
		System.out.println(map.containsKey(null));
		System.out.println(map.containsValue(null));
		map.put(null, d);
		System.out.println(map.size());
		System.out.println(map.get(null));
	}
	
	static class DynValue {
		int i;
		
		public DynValue(int i) {
			this.i = i;
		}

		public void setI(int i ) {
			this.i = i;
		}
		
		@Override
		public String toString() {
			return "" + i;
		}
	}
}
