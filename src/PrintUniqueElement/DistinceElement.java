package PrintUniqueElement;

public class DistinceElement {

    public static void main(String[] args)
    {

        int[] arr={10,20,30,20,10,40};
        int len=arr.length;
        print(arr,len);
    }

    private static void print(int[] arr, int len) {

        for(int i=0;i<len;i++)
        {int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }
}
