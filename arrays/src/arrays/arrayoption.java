package arrays;

import java.util.Scanner;

public class arrayoption 
{
	int index;
	Scanner sc;
	int size;
	
	arrayoption()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter size for array : ");
		size=sc.nextInt();   // 10
		index=-1;
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
			System.out.println("Enter Numbers: ");
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
	
	public int[] insertionfirst(int a[])  // a[10]
	{
		if(size<=index+1)   // (10>5)
		{
			System.out.println("Not have enough space left");
			System.out.println("Avaialable space : "+0);
		}
		else
		{
			for(int i=index+1;i>0;i--)
			{
				a[i]=a[i-1];
			}
		
			System.out.println("\nEnter new value : ");
			a[0]=sc.nextInt();
			
			index++;
			
		}
		return(a);
	}
	
	public int[] insertionlast(int a[])  // a[10]
	{
		if(size<=index+1)   // (10>5)
		{
			System.out.println("Not have enough space left");
			System.out.println("Avaialable space : "+0);
		}
		else
		{
		
			System.out.println("Enter new number to add: ");
			a[index+1]=sc.nextInt();
		
			index++;
		}
		return(a);
	}
	
	public int[] insertionpos(int a[])
	{
		if(size<=index+1)   // (10>5)
		{
			System.out.println("Not have enough space left");
			System.out.println("Avaialable space : "+0);
		}
		else
		{
		
			System.out.println("\nEnter position: ");
			int p=sc.nextInt();
		
			int sindex=p-1;
			
			for(int i=index+1;i>sindex;i--)
			{
				a[i]=a[i-1];
			}
			System.out.println("Enter new value : ");
			a[sindex]=sc.nextInt();
		
			index++;
		}
		return(a);
	}
	
	public int[] insertionvalue(int a[])
	{
		
		System.out.println("\nEnter a value: ");
		int v=sc.nextInt();
		int pos=-1;
		int f=0;
		int g=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(v==a[i])
			{
				System.out.println("Value found on Position: "+(i+1));
				int p=i;
					for(i=index+1;i>p-1;i--)
					{
						a[i]=a[i-1];
					}
					System.out.println("Enter new value: ");
					a[p]=sc.nextInt();
					
					index++;
					
					return(a);
			}
		}
		if(f==0)
		{
			System.out.println("Not found");
		}
		return (a);
	}
	
	public int deleteFirstValue(int a[])
	{
		int data=a[0];  
		for(int i=0;i<index;i++)  
		{
			a[i]=a[i+1];   
		}
		a[index--]=0;
		
		return data;
		
	}
	
	public int[] deletelast(int a[])
	{
		a[index--]=0;
		
		return(a);
	}
	
	public int[] deletepos(int a[])
	{
		System.out.println("\nEnter position: ");
		int p=sc.nextInt();
	
		int sindex=p-1;
		
		int data=a[sindex];
		
		for(int i=0;i<=index;i++)  
		{
			a[sindex]=a[sindex+1];   
		}
		a[index]=0;
		index--;
		
		return(a);
	}
	
	public int[] deletevalue(int a[])
	{
		System.out.println("\nEnter a value: ");
		int v=sc.nextInt();
		int f=0;
		
		for(int i=0;i<=index;i++)
		{
			if(v==a[i])
			{
				System.out.println("Value found on Position: "+(i+1));
				int pos=i;
				int p=a[i];
					for(int i1=0;i1<index;i1++)  
						{
						a[pos]=a[pos+1];   
						}
					a[index]=0;
					index--;
					
					return(a);
			}
		}
		if(f==0)
		{
			System.out.println("Not found");
		}
		return (a);
	}
	
	public static void main(String[] args) 
	{
		arrayoption option=new arrayoption();
		
		int a[]=option.createArray();
		
		a=option.insertion(a);
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			
			System.out.println("\nOptions:-");
			System.out.println(" ");
			System.out.println("1. Insertion");
			System.out.println("2. Deletin");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			int c=0;
			
			if(choice==1) 
			{
				System.out.println("1. At first");
				System.out.println("2. At last");
				System.out.println("3. At position");
				System.out.println("4. At value");
				System.out.println(" ");
				
				System.out.println("Enter your choice: ");
				c=sc.nextInt();
				
				if(c==1) 
				{
					option.insertionfirst(a);
					
					option.display(a);
				}
				else if(c==2)
				{
					option.insertionlast(a);
					option.display(a);
				}
				else if(c==3)
				{
					option.insertionpos(a);
					option.display(a);
				}
				else if(c==4)
				{
					option.insertionvalue(a);
					option.display(a);
					
				}
				else
				{
					System.out.println(" ");
					System.out.println("you have entered wrong option");
				}
			}
			
			else if(choice==2)
			{
				
					System.out.println("1. Delete first");
					System.out.println("2. Delete last");
					System.out.println("3. Delete by position");
					System.out.println("4. Delete by value");
					
					System.out.println("\nEnter your choice: ");
					c=sc.nextInt();
					
					if(c==1) 
					{
						option.deleteFirstValue(a);
						
						option.display(a);
					}
					else if(c==2)
					{
						option.deletelast(a);
						option.display(a);
					}
					else if(c==3)
					{
						option.deletepos(a);
						option.display(a);
					}
					else if(c==4)
					{
						option.deletevalue(a);
						option.display(a);
					}
					else
					{
						System.out.println(" ");
						System.out.println("you have entered wrong option");
					}
				
			}
			
			else if(choice==3) 
			{
				System.out.println("Exited....");
			}
			
			else
			{
				System.out.println("Wrong option");
			}
			System.out.println("\n------------------------");
		
	  }while(choice!=3);
	}
	
}
