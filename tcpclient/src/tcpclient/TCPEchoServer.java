package tcpclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;


public class TCPEchoServer {

	private static final int BUFSIZE = 32;

	public static void main(String[] args)throws IOException {
		if(args.length!=1)
			throw new IllegalArgumentException("Parameter(s):<Port>");
		int servPort=Integer.parseInt(args[0]);
		ServerSocket servsock=new ServerSocket(servPort);
		int recvMsgSize;
		byte[] receiveBuf=new byte[BUFSIZE];
		while(true){
			Socket clntSock=servsock.accept();
			SocketAddress clientAddress=clntSock.getRemoteSocketAddress();
			System.out.println("Handing clinet at"+clientAddress);
		
		InputStream in=clntSock.getInputStream();
		OutputStream out=clntSock.getOutputStream();
		while((recvMsgSize=in.read(receiveBuf))!=-1){
			out.write(receiveBuf,0,recvMsgSize);
		}
		clntSock.close();
}
	}
}
