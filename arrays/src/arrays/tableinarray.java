package arrays;

public class tableinarray {

	public static void main(String[] args) 
	{
		int table[]=new int[10];
		int t=0;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			t=i*2;
			table[i-1]=t;
			System.out.println(table[i-1]);
			sum=sum+table[i-1];	
		}
		System.out.println("sum of array: "+sum);
	}

}
