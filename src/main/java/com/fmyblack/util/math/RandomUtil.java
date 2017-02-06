package com.fmyblack.util.math;

import java.util.Random;

public class RandomUtil {

	private static Random rand = new Random(47);
	
	/**
	 * 返回一个[0, bound)间的随机整数
	 * @param bound
	 * @return
	 */
	public static int randInt(int bound) {
		return rand.nextInt(bound);
	}
	
	public static void main(String[] args) {
	}
}
