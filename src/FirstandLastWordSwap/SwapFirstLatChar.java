package FirstandLastWordSwap;

public class SwapFirstLatChar {

    public static void main(String[] args) {

        String str="hello how are you";
        System.out.println(count(str));
    }

    private static String count(String str) {

        char[] arr = str.toCharArray();

        for(int i =0;i<arr.length;i++)
        {
            int k=i;

            while (i < arr.length && arr[i] != ' ')
                i++;

            char temp= arr[k];
            arr[k]= arr[i-1];
            arr[i-1] =temp;
        }



        return new String (arr);
    }

}


