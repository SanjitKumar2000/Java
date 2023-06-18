import java.util.Scanner;

public class Ifelseif 
{

	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modelus");
		System.out.println("Choose one Option:");
		int choice=scan.nextInt();
		int a=0,b=0;
		
		if(choice>=1 && choice<=5)
		{
			System.out.println("Enter the firts number: ");
			a=scan.nextInt();
			System.out.println("Enter the second number: ");
			b=scan.nextInt();
		}
		if(choice==1)
		{
			System.out.println("Sum = "+(a+b));
		}
		else if(choice==2)
		{
			System.out.println("Difference = "+(a-b));
		}
		else if(choice==3)
		{
			System.out.println("Product = "+(a*b));
		}
		else if(choice==4)
		{
			System.out.println("Dividon = "+(a/b));
		}
		else if(choice==5)
		{
			System.out.println("Modelus = "+(a%b));
		}
		else if(choice==6)
		{
			System.out.println("Good bye");
		}
		else
		{
			System.out.println("You have entered wrong option");
		}
	}

}
