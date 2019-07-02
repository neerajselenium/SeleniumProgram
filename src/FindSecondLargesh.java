import java.util.Arrays;

public class FindSecondLargesh {

    public static void main(String[] args) {


        SecondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796});

    }

    private static void SecondLargest(int[] inputArray) {

        int largest, smallast;

        if(inputArray[0]>inputArray[1])
        {
            largest=inputArray[0];
            smallast=inputArray[1];
        } else
        {
            largest=inputArray[1];
            smallast=inputArray[0];
        }


            for(int i=2;i<inputArray.length;i++)
            {
                { if(inputArray[i] > largest)
                {
                    //If element at 'i' is greater than 'firstLargest'

                    smallast = largest;

                    largest = inputArray[i];
                }
                else if (inputArray[i] < largest && inputArray[i] > smallast)
                {
                    //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'

                    smallast = inputArray[i];
                }
                }
            }

        System.out.println("Input Array :");

        System.out.println(Arrays.toString(inputArray));

        System.out.println("Second Largest Element : ");

        System.out.println(smallast);
    }
}
