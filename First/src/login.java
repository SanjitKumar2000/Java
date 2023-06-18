import java.util.Scanner;

public class login 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id: ");
		String userid=sc.nextLine();
		
		if(userid.equals("manu"))
		{
			System.out.println("Enter Password: ");
			String pass=sc.nextLine();
			if(pass.equals("12345"))
			{
				System.out.println("Loging Successfull");
				System.out.println("user ID :"+userid);
			}
			else
			{
				System.out.println("you ahve entered wrong password");
				System.out.println("pls try diffent password and try anagin.");
			}
		}
		else 
		{
			System.out.println("Incorrect UserID");
			System.out.println("Pls try differnt userid");
		}
		
	}

}
