package com.fmyblack.util.test;

public class Test1 extends Test{

	private class In{
		int i;
		
		public void p() {
			System.out.println(i);
		}
		
		public void add() {
			i++;
		}
	}
	
	public In getIn() {
		return new In();
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		In i = t.getIn();
		i.p();
		i.add();
		i.p();
	}
}
