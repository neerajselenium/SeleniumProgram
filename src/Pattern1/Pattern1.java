package Pattern1;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter no: ");
	int num= in.nextInt();
	
	for(int i =1;i<=num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println("");
	}
	
	
	
	for(int i =num;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println("");
	}
	
	
	
	
	}
}
