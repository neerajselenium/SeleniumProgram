import java.util.Scanner;

public class BubbleSort {

        public static void main(String[] args)
        {
            int[] arr = new int[50];

            System.out.println("enter number to sort");
            Scanner scn = new Scanner(System.in);

            System.out.println("enter total nummbers:");
            int num = scn.nextInt();

            for(int i =0;i<num;i++)
            {
               arr[i]= scn.nextInt();
            }


            for(int i =0;i<num;i++)
            {
                for(int j=i+1;j<num;j++)
                {
                if(arr[i]>arr[j])
                {

                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }

                }

            }

            for(int i =0;i<num;i++)
            {
                System.out.print(arr[i]+ "  ");

            }

        }
}
