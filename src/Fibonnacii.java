import java.util.Scanner;

public class Fibonnacii {

    public static void main(String[] args) {

        int a,b, temp;
        a=1;
        b=1;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number:");

        int number  = in.nextInt();
        System.out.println(a  );
        for(int i =1;i<=number;i++)
        {
            temp=b;
            b=a+b;

            System.out.println(b);
            a=temp;






        }





    }
}
