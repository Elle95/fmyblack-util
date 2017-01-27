package com.fmyblack.util.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInUtil {

	/**
	 * 获得标准输入的BufferReader
	 * @return
	 */
	public static BufferedReader getConsoleIn() {
		return new BufferedReader(
                new InputStreamReader(System.in));
	}
	
	public static void main(String[] args) {
		BufferedReader br = getConsoleIn();
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				System.out.println("return:\t" + line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
