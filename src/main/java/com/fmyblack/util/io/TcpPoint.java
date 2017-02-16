package com.fmyblack.util.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpPoint {

	Socket			socket;
	OutputStream	os;
	PrintWriter		pw;
	InputStream		is;
	BufferedReader	br;

	public TcpPoint(Socket socket) throws IOException {
		this.socket = socket;
		os = socket.getOutputStream();
		pw = new PrintWriter(os);
		is = socket.getInputStream();
		br = new BufferedReader(new InputStreamReader(is));
	}

	public void send(String s) {
		pw.write(s);
		pw.flush();
		// socket.shutdownInput();
	}

	public String readAll() throws IOException {
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}

	public void closeWriter() throws IOException {
		pw.close();
		os.close();
	}

	public void closeReader() throws IOException {
		br.close();
		is.close();
	}

	public void closeSocket() throws IOException {
		socket.close();
	}

	public void closeAll() throws IOException {
		closeReader();
		closeWriter();
		closeSocket();
	}
}
