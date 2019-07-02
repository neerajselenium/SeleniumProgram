import java.util.Scanner;

public class ReverseWordbyWord {

    public static void main(String[] args) {

        Scanner str= new Scanner(System.in);
        System.out.println("enter string");
        String  original= str.nextLine();
        System.out.println("Orignal string is: " + original);

        String[] word= original.split("\\s");
        String reverse="";
        for(int i=word.length-1;i>=0;i--)
        {
             reverse = reverse + word[i]+ " ";
        }

        System.out.println("Reverse string is :"+ reverse);
    }
}
