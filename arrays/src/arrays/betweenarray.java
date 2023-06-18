package arrays;

import java.util.Scanner;

public class betweenarray {
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
		
		System.out.println("\nindex: "+index);
		
		System.out.println("\nEnter position: ");
		int p=sc.nextInt();
		
		int sindex=p-1;
		
		for(int i=index+1;i>sindex;i--)
		{
			a[i]=a[i-1];
		}
		System.out.println("Enter new value : ");
		a[sindex]=sc.nextInt();
		
		display(a);
	}

}
