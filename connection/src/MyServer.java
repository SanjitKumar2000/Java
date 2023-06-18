import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer 
{

	public static void main(String[] args) throws IOException 
	{
		ServerSocket ss=new ServerSocket(6666);

		Socket s=ss.accept();
		//creating connection between server and client

		DataInputStream dis=new DataInputStream(s.getInputStream());

		String str=dis.readUTF();
		System.out.println(str);
		ss.close();
	}

}
