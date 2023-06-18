package info.threedarrays;

import java.util.Scanner;

public class third 
{
	public static void display(int a[][][])
	{
		for(int t=0;t<a.length;t++)
		{
			System.out.println("matrix: "+(t+1));
			for(int r=0;r<a[t].length;r++)
			{
				for(int c=0;c<a[t][r].length;c++)
				{
					System.out.print(a[t][r][c]+"\t");
				}
				System.out.println(" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int a[][][]=new int[3][3][3];
		int b=100;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter value: ");
		
		for(int t=0;t<a.length;t++)
		{
			System.out.println(("\n")+(t+1)+" matrix: ");
			for(int r=0;r<a[t].length;r++)
			{
				for(int c=0;c<a[t][r].length;c++)
				{
					a[t][r][c]=sc.nextInt();
				}
			}
		}
		display(a);
		
	}

}
