package com.fmyblack.util.test;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Random;

import com.fmyblack.util.io.TcpClient;

public class Test {

	public static void main(String[] args) {
		try {
			TcpClient tc = new TcpClient("s",3);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
