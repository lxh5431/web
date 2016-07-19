package tcpclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class TCPEchoClient {
	/**
	 * 
	 * @author lxh
	 * @param args
	 * @throws IOException
	 * @version 1.0
	 * @throws
	 */
public static void main(String[] args)throws  IOException {
	//判断输入的参数
	if((args.length<2)||(args.length>3))
		throw new IllegalArgumentException("Parameter(s):<Server><word>[<Port>]");
	//转换为数组，
	String server=args[0];
	byte[] data=args[1].getBytes();
	int servPort=(args.length==3)?Integer.parseInt(args[2]):7;
	Socket socket=new Socket(server,servPort);
	System.out.println("Connected to server...sending echo string");
	//获取套接字的输入输出流
	InputStream in=socket.getInputStream();
	OutputStream out=socket.getOutputStream();
	out.write(data);//读写数据
	int totalBytesRcvd=0;
	int bytesRcvd;
	//接受服务器返回的数据
	while(totalBytesRcvd<data.length){
		if((bytesRcvd=in.read(data, totalBytesRcvd, data.length-totalBytesRcvd))==-1)
			throw new SocketException("Connection closed permaturely");
		totalBytesRcvd+=bytesRcvd;
	}
	System.out.println("Received:"+new String(data));
	socket.close();
}


}
