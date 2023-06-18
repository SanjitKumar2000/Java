package info.threedarrays;

import java.util.Scanner;

public class fiveD 
{
	public static void display(int a[][][][][])
	{
		for(int f=0;f<a.length;f++)
		{
			System.out.println("\ncontainer: "+(f+1));
			for(int p=0;p<a[f].length;p++)
			{
				System.out.println("\nPackege: "+(p+1));
				for(int t=0;t<a[f][p].length;t++)
				{
					System.out.println("\nmatrix: "+(t+1)+"\n");
					for(int r=0;r<a[f][p][t].length;r++)
					{
						for(int c=0;c<a[f][p][t][r].length;c++)
						{
							System.out.print(a[f][p][t][r][c]+"\t");
						}
						System.out.println(" ");
					}
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int a[][][][][]=new int[3][3][3][3][3];
		int b=1;
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter value: ");
		for(int f=0;f<a.length;f++)
		{
			for(int p=0;p<a.length;p++)
			{
				for(int t=0;t<a[p].length;t++)
				{
					for(int r=0;r<a[p][t].length;r++)
					{
						for(int c=0;c<a[p][t][r].length;c++)
						{
							a[f][p][t][r][c]=b++;
						}
					}
				}
			}
		}
		display(a);

	}
}
