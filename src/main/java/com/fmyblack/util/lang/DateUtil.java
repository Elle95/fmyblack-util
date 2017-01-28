package com.fmyblack.util.lang;

import org.joda.time.DateTime;

/**
 * 封装常用时间类
 * 如需要其他时间，也可以先获得now.getDate()，再进行joda时间运算
 * @author fmyblack
 *
 */
public enum DateUtil {

	now(DateTime.now()),
	today(DateTime.now().withTimeAtStartOfDay()),
	yesterday(DateTime.now().withTimeAtStartOfDay().minusDays(1)),
	tomorrow(DateTime.now().withTimeAtStartOfDay().plusDays(1));
	
	protected DateTime date;
	
	DateUtil(DateTime date) {
		this.date = date;
	}
	
	public DateTime getDate(){
		return this.date;
	};

	@Override
	public String toString() {
		return this.getDate().toString();
	}
	
	public String toString(String format) {
		return this.getDate().toString(format);
	}
	
	public static void main(String[] args) {
		for(DateUtil d : DateUtil.values()) {
			System.out.println(d);
		}
	}
}
