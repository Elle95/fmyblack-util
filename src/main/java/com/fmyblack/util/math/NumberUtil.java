package com.fmyblack.util.math;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class NumberUtil {

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static boolean isDouble(String s ) {
		try {
			Double.parseDouble(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		if(isInteger("12")) {
			System.out.println("yues");
		}
	}
}
