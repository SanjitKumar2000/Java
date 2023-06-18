import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient
{

	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Write Message : ");
			String s1=sc.nextLine();

			Socket s=new Socket("127.0.0.1",6666);
			//socket(client,serverport)
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			out.writeUTF("Client Message : "+s1);
			out.flush();
			out.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
