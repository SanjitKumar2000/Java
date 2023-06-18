package arrays;

import java.util.Scanner;

public class Lastadd {
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
		System.out.println("\n");
		
		System.out.println("Enter new number to add: ");
		int nn=sc.nextInt();
		
		a[index+1]=nn;
		
		display(a);
	}

}
