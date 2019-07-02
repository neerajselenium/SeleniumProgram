import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args)
    {
        System.out.print("enter string :");
        Scanner s= new Scanner(System.in);
        String original= s.nextLine();

        System.out.println("Original String is: "+ original);


        String reverse ="";
        int len= original.length();
        for(int i= len-1;i>=0;i--)
        {
            reverse= reverse + original.charAt(i)  ;


        }


        System.out.println("reverse string is"+ reverse);



    }
}
