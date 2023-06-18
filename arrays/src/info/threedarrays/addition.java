package info.threedarrays;

import java.util.Scanner;

public class addition 
{
	public static void display(int a[][],int b[][],int d[][],int e[][])
	{
		System.out.println("First matrix: ");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("\nsecond matrix:");
		for(int r=0;r<b.length;r++)
		{
			for(int c=0;c<b[r].length;c++)
			{
				System.out.print(b[r][c]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("\nAdditon:");
		for(int r=0;r<d.length;r++)
		{
			for(int c=0;c<d[r].length;c++)
			{
				System.out.print(d[r][c]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("\nMultiplication:");
		for(int r=0;r<e.length;r++)
		{
			for(int c=0;c<e[r].length;c++)
			{
				System.out.print(e[r][c]+"\t");
			}
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int d[][]=new int[3][3];
		int e[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Velues for a: ");
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		System.out.println("Enter values for b: ");
		for(int r=0;r<b.length;r++)
		{
			for(int c=0;c<b[r].length;c++)
			{
				b[r][c]=sc.nextInt();
			}
		}
		for(int r=0;r<d.length;r++)
		{
			for(int c=0;c<d[r].length;c++)
			{
				d[r][c]=a[r][c]+b[r][c];
			}
		}
		for(int r=0;r<e.length;r++)
		{
			for(int c=0;c<e[r].length;c++)
			{
				int m=0;
				for(int i=0;i<e.length;i++)
				{
				m=m+a[r][i]*b[i][r];
				}
				System.out.println(m+"\t");
			}
			System.out.println();
		}
		display(a,b,d,e);
	}

}
