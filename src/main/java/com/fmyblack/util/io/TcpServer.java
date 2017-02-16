package com.fmyblack.util.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	ServerSocket ss;
	
	public TcpServer(int port) throws IOException {
		ss = new ServerSocket(port);
		
		while(true) {
			Socket realSocket = ss.accept();
			new Establishe(realSocket);
		}
	}
	
	class Establishe extends TcpPoint implements Runnable {

		public Establishe(Socket socket) throws IOException {
			super(socket);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				String req = this.readAll();
				System.out.println("req is:\t" + req);
				this.send(req.toLowerCase());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					this.closeAll();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			new TcpServer(9999);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
