package arrays;

import java.util.Scanner;

public class ststement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("a: ");
		int a=sc.nextInt();
		System.out.println("b: ");
		int b=sc.nextInt();
		int c = 0;
		
		for(int i=0;i<=10;i++) 
		{
		c=a+b;
		}
		System.out.println("sum: "+c);
	}

}
