package DiffScanBuffer;

import java.util.Scanner;

public class ScannerBuffer {
	
	public static void main(String args[])
	
	{
		
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scn.nextInt();
        System.out.println("Enter a String");
        String b = scn.nextLine();
        System.out.printf("You have entered:- "
                + a + " " + "and name as " + b);
    
	}

}
