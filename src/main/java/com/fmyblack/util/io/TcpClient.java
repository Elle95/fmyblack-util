package com.fmyblack.util.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient extends TcpPoint {

	public TcpClient(String ip, int port) throws UnknownHostException, IOException {
		super(new Socket(ip, port));
	}

	public String getResponse(String req) {
		String resp = null;
		try {
			this.send(req);
			resp = this.readAll();
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
		return resp;
	}

	public static void main(String[] args) throws IOException {
		TcpClient tc = new TcpClient("d", 3);
		tc.socket.close();
	}

}
