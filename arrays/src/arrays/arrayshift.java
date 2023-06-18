package arrays;

import java.util.Scanner;

public class arrayshift 
{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		int index=-1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eumbers: ");
		int s=sc.nextInt();
		System.out.println("Enter number: ");
		
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			index++;
		}
		for(int x:a)
		{
			System.out.print("\t"+x);
			
		}
		System.out.println("\nIndex: "+index);
		
		for(int i=index+1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		System.out.println("Enter the number to insert on first place: ");
		int nn=sc.nextInt();
		a[0]=nn;
		
		for(int x:a)
		{
		System.out.print("\t"+x);	
		}
		
	}
}