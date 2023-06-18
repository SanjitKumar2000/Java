package pack1;

import java.util.Scanner;

public class method1 
{
	int add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter second number: ");
		int b=sc.nextInt();
		
		int sum=a+b;
		
		return sum;
	}
	
	int add1(int a,int b) 
	{
		return(a+b);
	}
	
	
	public static void main(String[] args)
	{
		method1 m1=new method1();
		
		int sum1=m1.add();
		
		int sum2=m1.add();
		
		System.out.println("sum1: "+sum1);
		
		System.out.println("sum2: "+sum2);
		
		System.out.println("sum3: "+m1.add1(sum1 ,sum2));
		
		System.out.println("sum4: "+m1.add1(22 , 44));
	}
}
