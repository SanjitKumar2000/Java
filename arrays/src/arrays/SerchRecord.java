package arrays;

import java.util.Scanner;

public class SerchRecord
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Id: ");
		int uid=sc.nextInt();
		int f=0;
		
		UserData ud=new UserData();
		
		for(int i=0;i<ud.id.length;i++)
		{
			if(uid==ud.id[i])
			{
				System.out.println("ID found");
				System.out.println("Name: "+ud.name[i]);
				System.out.println("Phone: "+ud.phone[i]);
				System.out.println("Name: "+ud.pin[i]);
				System.out.println("Name: "+ud.balance[i]);
				
				System.out.println("Enter new pin: ");
				int newpin=sc.nextInt();
				System.out.println("Retype pin: ");
				int retype=sc.nextInt();
				
				if(newpin==retype)
				{
					ud.pin[i]=newpin;
					System.out.println("your pin is updated");
				}
				else
				{
					System.out.println("New pin does not match retype pin");
				}
				
				f=1;
				break;
			}
			
		}
		if(f==0)
		{
			System.out.println("ID not found!");
		}
	}
}
