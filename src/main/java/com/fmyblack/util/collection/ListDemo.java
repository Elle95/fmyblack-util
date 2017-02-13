package com.fmyblack.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo implements Comparable<ListDemo>{

	int i;
	
	public ListDemo(int i ) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		Set<ListDemo> s = new TreeSet<ListDemo>();
		ListDemo l1 = new ListDemo(9);
		ListDemo l2 = new ListDemo(1);
		ListDemo l3 = new ListDemo(5);
		s.add(l1);
		s.add(l2);
		s.add(l3);
		System.out.println(s.toString());
		for(ListDemo l : s) {
			System.out.println(l.i);
		}
	}

	@Override
	public int compareTo(ListDemo o) {
		// TODO Auto-generated method stub
		return this.i - o.i;
	}
}
