package arrays;

import java.util.Scanner;

public class deletion
{
	int index;
	Scanner sc;
	int size;
	
	deletion()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter size for array : ");
		size=sc.nextInt();   // 10
		index=-1;           // index=-1
	}
	
	public int[] createArray()
	{
		int a[]=new int[size];  // a[10]
		return a;
	}
	
	public void display(int a[])
	{
		System.out.println("Array Elements \n");
		for(int v:a)
		{
			System.out.print(v+"\t");
		}
	}
	
	public boolean isFull()
	{
		if(index==size-1) // -1 == 9 false
			return true;
		else
			return false;
	}
	
	public int[] insertion(int a[])  // a[10]
	{
		
		if(isFull())  // call isFull =false
		{
			System.out.println("Can't Insert values! Array is full!");
		}
		else
		{
			System.out.println("Enter number of elements : ");
			int n=sc.nextInt(); // 5
			int available=size-index-1;  // available= 10-(-1)-1=10
			if(available>n)   // (10>5)
			{
				for(int i=0;i<n;i++)  // i=0 i<5 i=0
				{
					a[i]=sc.nextInt();  // a[0]=11
					index++;            // index= -1 -> 0 1 2 3 4
				}
			}
			else
			{
				System.out.println("Not have enough space left");
				System.out.println("Avaialable space : "+available);
			}
			display(a);
		}
		return(a);
	}
	
	public int deleteFirstValue(int a[])
	{
		int data=a[0];  // data=11
		//shifting of elements
		for(int i=0;i<index;i++)  // i=0 1  2 3 4  i<4
		{
			a[i]=a[i+1];   // a[3]=a[4](14)
		}
		a[index--]=0;  // a[4]=0,  index=index-1=4-1=3
		return data;
	}
	
	public static void main(String[] args) 
	{
		deletion delete=new deletion();
		
		int a[]=delete.createArray();  // a[10]
		
		a=delete.insertion(a);  // a[]=11 12 13 14 15  index=4
		
		int value=delete.deleteFirstValue(a); // a
		System.out.println("\nDeleted value : "+value);
		
		delete.display(a);
	}
}