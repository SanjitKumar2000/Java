//client server dual communication
//server class

import java.io.*;
import java.net.*;

class myServer1
{
	public static void main(String args[])throws IOException
	{
		ServerSocket ss=new ServerSocket(6666);
		Socket s=ss.accept();
		
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		
		while(!str1.equals("stop"))
		{
			str1="";str2="";
			str1=dis.readUTF();     // getting msg from client
			System.out.println("Client Says: "+str1);
			System.out.println("\nWrite message to Client : ");
			str2=br.readLine(); //saving msg in str2
			dos.writeUTF(str2);  //sending msg(str2) to client
			dos.flush();  // cleaning dos
			//dis.flush();
		}
		dis.close();
		s.close();
		ss.close();
	}
}
