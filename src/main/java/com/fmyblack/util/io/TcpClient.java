package com.fmyblack.util.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	Socket socket;
	OutputStream os;
	PrintWriter pw;
	InputStream is;
	BufferedReader br;
	
	public TcpClient(String ip, int port) throws UnknownHostException, IOException {
		socket = new Socket(ip, port);
		os = socket.getOutputStream();
		pw = new PrintWriter(os);
		is = socket.getInputStream();
		br = new BufferedReader(
				new InputStreamReader(is));
	}
	
	public void sendToServer(String s) {
		pw.write(s);
		pw.flush();
//		socket.shutdownInput();
	}
	
	public String getResponse() {
		StringBuilder sb = new StringBuilder();
		String line = null;
		try {
			while( (line = br.readLine()) != null ) {
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
	public static void main(String[] args) throws IOException {
		TcpClient tc = new TcpClient("d", 3);
		tc.socket.close();
	}
	
}
