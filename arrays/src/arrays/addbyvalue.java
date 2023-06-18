package arrays;

import java.util.Scanner;

public class addbyvalue {
	public static void display(int a[])
	{
		for(int x:a)
			System.out.print("\t"+x);
	}

	public static void main(String[] args)
	{
		int a[]=new int[10];
		int index=-1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Arry: ");
		int s=sc.nextInt();
		System.out.println("Enter number: ");
		
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			index++;
			
		}
		display(a);
		
		System.out.println("\nIndex: "+index);
		
		System.out.println("\nEnter a value: ");
		int v=sc.nextInt();
		int pos=-1;
		int f=0;
		int g=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(v==a[i])
			{
				System.out.println("Value found on Position: "+(i+1));
				int p=i;
				
				if(index!=a.length-1)
				{
					for(i=index+1;i>p-1;i--)
					{
						a[i]=a[i-1];
					}
					System.out.println("Enter new value: ");
					a[p]=sc.nextInt();
					
					display(a);
					
				}
				else 
				{
						System.out.println("Array is full");
						f=1;
						break;
				}
				
			}
		}
		if(f==0)
		{
			System.out.println("Not found");
		}
	}

}
