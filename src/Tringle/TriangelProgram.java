package Tringle;

import java.util.Scanner;

public class TriangelProgram {

	public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
	 System.out.print("Entre number: ");
	 int num= in.nextInt();
	 
	 for(int i =num;i>=1;i--)
	 {
		 for(int j=1;j<i;j++)
		 {
			 System.out.print(" ");
		 }
		 
		 for(int j=i;j<=num;j++)
		 {
			 System.out.print("*"+ " ");
		 }
		 
		 
		 System.out.println("");
		 
	 }

	}

}
