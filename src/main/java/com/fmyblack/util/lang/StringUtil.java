package com.fmyblack.util.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	/**
	 * 判断是否匹配正则表达式
	 * @param s
	 * @param regex
	 * @return
	 */
	public static boolean isMatch(String s, String regex) {
		Pattern pattern = Pattern.compile(regex);
		return isMatch(s, pattern);
	}
	
	/**
	 * 判断是否匹配正则表达式
	 * @param s
	 * @param pattern
	 * @return
	 */
	public static boolean isMatch(String s, Pattern pattern) {
		Matcher matcher = pattern.matcher(s);
		return matcher.matches();
	}
	
	/**
	 * 判断是否包含正则
	 * @param s
	 * @param regex
	 * @return
	 */
	public static boolean isFind(String s, String regex) {
		Pattern pattern = Pattern.compile(regex);
		return isFind(s, pattern);
	}
	
	/**
	 * 判断是否包含正则
	 * @param s
	 * @param pattern
	 * @return
	 */
	public static boolean isFind(String s, Pattern pattern) {
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}
	
	public static void main(String[] args) {
		String s = "www@d";
		String regex = ".*@";
		System.out.println(isMatch(s, regex));
		System.out.println(isFind(s, regex));
	}
}
