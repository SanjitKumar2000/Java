import java.net.*;
import java.io.*;

class myClient1
{
	public static void main(String args[])throws IOException
	{
		Socket s=new Socket("localhost",6666);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str1="",str2="";

		while(!str1.equals("stop"))
		{
			str1="";str2="";
			System.out.println("Write Message to Server : ");
			str1=br.readLine();    // storing msg into str1
			dos.writeUTF(str1);   // sending msg(str1) to server
			dos.flush();        //cleaning dos
			str2=dis.readUTF();   // receiving msg into str2 from server
			System.out.println("Server says : "+str2);
			
		}
		dos.close();
		s.close();
		
	}

}