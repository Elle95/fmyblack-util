package com.fmyblack.util.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachMap {

	public static Map<String, String> readFileByLines(String fileName, int i, Map<String, String> map) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
//                System.out.println("line " + line + ": " + tempString);
//                line++;
            	String[] cols = tempString.split("\t");
            	map.put(cols[0] + i, cols[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return map;
    }
	
	public static void main(String[] args) {
		String fileName = "/Users/fmyblack/javaproject/fmyblack-util/src/main/resources/data/words.data";
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < 10; i++) {
			readFileByLines(fileName, i, map);
		}
		System.out.println(map.size());
		long start = System.currentTimeMillis();
		foreach2(map);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static void foreach1(Map<String, String> map) {
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
		}
	}
	
	public static void foreach2(Map<String, String> map) {
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			
		}
	}
	
	public static void foreach3(Map<String, String> map) {
		for(String key : map.keySet()) {
			String value = map.get(key);
		}
	}
}
