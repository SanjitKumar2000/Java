package info.threedarrays;

import java.util.Scanner;

public class fourD 
{
	public static void display(int a[][][][])
	{
		int num=0;
		for(int p=0;p<a.length;p++)
		{
			System.out.println("\nPackege: "+(p+1));
			for(int t=0;t<a.length;t++)
			{
				System.out.println("\nmatrix: "+(t+1)+"\n");
				for(int r=0;r<a[t].length;r++)
				{
					for(int c=0;c<a[t][r].length;c++)
					{
						System.out.print(a[p][t][r][c]+"\t");
					}
					System.out.println("\n");
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int a[][][][]=new int[3][3][3][3];
		int b=1;
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter value: ");
		for(int p=0;p<a.length;p++)
		{
			for(int t=0;t<a[p].length;t++)
			{
//				System.out.println(("\n")+(t+1)+" matrix: ");
				for(int r=0;r<a[p][t].length;r++)
				{
					for(int c=0;c<a[p][t][r].length;c++)
					{
						a[p][t][r][c]=b++;
					}
				}
			}
		}
		display(a);

	}

}
