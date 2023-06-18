package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class atm
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int uid=sc.nextInt();
		int f=0;
		double balance=0;
		
		
		UserData ud=new UserData();
		
		for(int i=0;i<ud.id.length;i++)
		{
			if(uid==ud.id[i])
			{
				int count=0;
				while(count<3)
				{
					System.out.println("Enter Pin: ");
					try 
					{
						int upin=sc.nextInt();
						count++;
						
						balance=ud.balance[i];
						if(upin==ud.pin[i])
							{ 
								int choice=0;
								
								System.out.println(" ");
								System.out.println("Login successful ");
								System.out.println("Hi "+ud.name[i]);
								System.out.println();
								
								
								
								do
								{
									System.out.println("Options:-");
									System.out.println(" ");
									System.out.println("1. Fast Cash");
									System.out.println("2. Cash Withdrawal");
									System.out.println("3. Deposit Cash");
									System.out.println("4. Check Balanace");
									System.out.println("5. Change Pin");
									System.out.println("6. Logout");
									System.out.println(" ");
									System.out.println("Enter your choice: ");
									choice=sc.nextInt();
									
									int c=0;
									if(choice==1) 
									{
										
										System.out.println("1. 500");
										System.out.println("2. 1000");
										System.out.println("3. 2000");
										System.out.println("4. 5000");
										System.out.println("5. 10000");
										
										System.out.println("Enter your choice: ");
										c=sc.nextInt();
										
										
										if(c==1) 
										{
											System.out.println(" ");
											System.out.println("500 withdrawal.");
											System.out.println("Remaing balance: "+(balance-=500));
										}
										else if(c==2)
										{
											System.out.println(" ");
											System.out.println("1000 withdrawal.");
											System.out.println("Remaing balance: "+(balance-=1000));
										}
										else if(c==3)
										{
											System.out.println(" ");
											System.out.println("2000 withdrawal.");
											System.out.println("Remaing balance: "+(balance-=2000));
										}
										else if(c==4)
										{;
											System.out.println(" ");
											System.out.println("5000 withdrawal.");
											System.out.println("Remaing balance: "+(balance-=5000));
										}
										else if(c==5)
										{
											System.out.println(" ");
											System.out.println("10000 withdrawal.");
											System.out.println("Remaing balance: "+(balance-=10000));
										}
										else
										{
											System.out.println(" ");
											System.out.println("you have entered wrong option");
										}
									}
									
									else if(choice==2)
									{
										
										System.out.println("Enter Amount to withdrawal: ");
										int w=sc.nextInt();
										if(w<=ud.balance[i])
										System.out.println("Remaing balance: "+(balance-=w));
										else
										{
											System.out.println("Insufficient Balance");
										}
										
									}
									
									else if(choice==3) 
									{
										System.out.println("Enter amount to deposit: ");
										float d=sc.nextFloat();
										System.out.println("Total balance: "+(balance+=d));
									}
									
									else if(choice==4)
									{
										System.out.println("Current Balance: "+balance);
									}
									
									else if(choice==5) 
									{
										System.out.println("Enter new pin: ");
										int npin=sc.nextInt();
										System.out.println("Retype pin: ");
										int rpin=sc.nextInt();
										if(npin==rpin)
											System.out.println("Pin Succefuly updated");
										else
											System.out.println("you Have entered worng pin");
									}
									
									
									else if(choice==6)
									{
										System.out.println("Logging Out");
									}
									
									else
									{
										System.out.println("Wrong option");
									}
									System.out.println("------------------------");
									
								}while(choice!=6);
								break;
							}
						else
							{
								System.out.println("\nYou have entered Wrong Pin.");
							}
					}catch(InputMismatchException ob)
					{
						System.out.println("Error: "+ob);
						count++;
						sc.next();
					}
					if(count==3)
						System.out.println("You have reached maximum attempts.\n");
					}
				System.out.println("Have a good day.");
				System.out.println("logged out.");
				f=1;
				break;
				}
			sc.close();
			if(f==0)
			{
				
				System.out.println("ID not Found.");
				break;
			}
			
				
		}
		
			
		
		
	}

}

