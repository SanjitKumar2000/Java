package arrays;

import java.util.Scanner;

public class assignment {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number fo emploies: ");
		int num=sc.nextInt();
		
		int empid=0;
		for(int i=101;i>100000;i++)
		{
			empid=i;
		}
		
		int id[]=new int[num];
		sc.nextLine();
		
		String empname[]=new String[id.length];
		float salary[]=new float[id.length];
		float exp[]=new float[id.length];
		float bonus[]=new float[id.length];
		float da,hra,ta,pf,total,net,netex;
		
		for(int i=0;i<num;i++)
		{
			System.out.println(" Enter name: ");
			empname[i]=sc.nextLine();
			
			System.out.println("Enter Salary: ");
			salary[i]=sc.nextFloat();
			
			System.out.println("Enter Experience: ");
			exp[i]=sc.nextFloat();
			
			System.out.println("  ");
			
			sc.nextLine();
			
		}
		for(int a=0;a<empname.length;a++)
		{
			System.out.println("--------------------");
			System.out.println("ID: "+id[a]);
			System.out.println("Name: "+empname[a]);
			System.out.println("Salary: "+salary[a]);
			if(exp[a]>10) {
				bonus[a]=(float) ((0.20)*salary[a]);
				System.out.println("Bonus: "+(bonus[a]));
			}
			else {
				bonus[a]=(float) ((0.10)*salary[a]);
				System.out.println("Bonus: "+(bonus[a]));
			}
			da=(float) (0.025*salary[a]);
			hra=(float) (0.04*salary[a]);
			ta=(float) (0.03*salary[a]);
			pf=(float) (0.15*salary[a]);
			total=salary[a]+da+hra+ta+pf;
			net=total-pf;
			netex=total-pf-bonus[a];
			System.out.println("da: "+da);
			System.out.println("hra: "+hra);
			System.out.println("ta: "+ta);
			System.out.println("pf: "+pf);
			System.out.println("Total salary: "+total);
			System.out.println("Net Salary excluding bonus: "+netex);
			System.out.println("Net Salary encluding bonus: "+net);
			System.out.println("--------------------------------");
			
		}
		
	}

}
