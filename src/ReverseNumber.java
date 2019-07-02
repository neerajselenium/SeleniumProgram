import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();

        System.out.println("entered number is :"+ num);
        int reverse=0;

        while(num!=0)
        {
            reverse = reverse *10;
            reverse = reverse + num%10;

            num=num/10;
        }

        System.out.println("Reverse string is: "+ reverse);

    }
}
