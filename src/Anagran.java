import java.util.Scanner;

public class Anagran {

    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter string:");
        String string1= scn.nextLine();
        System.out.println("enter string 2");
        String string2= scn.nextLine();

        int len1= string1.length();
        int len2= string2.length();

        int found =0; int notfound=0;

        if(len1==len2)
        {
            for(int i=0;i<len1;i++) {
                found = 0;
                for (int j = 0; j < len1; j++) {
                    if (string1.charAt(i) == string2.charAt(j)) {
                        found = 1;
                        break;

                    }
                }

                if (found == 0) {
                    notfound = 1;
                    break;
                }


            }

            if(notfound==1)
            {
                System.out.println("not anagaram");
            }else
            {
                System.out.println("both string are anagaram");
            }
        }

        else
        {
            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
        }




    }


}
