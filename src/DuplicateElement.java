import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElement {


    public static void main(String[] args) {

        int[] inputArr=new  int[] {111, 333, 555, 777, 333, 444, 555};

        System.out.println("======Brute force method======");

       // findDuplicatesUsingBruteForce(inputArr);

        System.out.println("======Duplicates Using Sorting======");

       // findDuplicatesUsingSorting(inputArr);

        System.out.println("======Duplicates Using HashSet======");

    //    findDuplicatesUsingHashSet(inputArr);

        System.out.println("======Duplicates Using HashMap======");

        findDuplicatesUsingHashMap(inputArr);

        System.out.println("======Duplicates Using Java 8 Streams======");

        findDuplicatesUsingJava8(inputArr);
        
    }




    private static void findDuplicatesUsingBruteForce(int[] inputArr) {
        int len= inputArr.length;
        for(int i =0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(inputArr[i]==inputArr[j])
                {
                    System.out.println("Duplicate Element:  "+  inputArr[i]);
                }
            }
        }

    }

    private static void  findDuplicatesUsingSorting(int[] inputArr)
    {
        Arrays.sort(inputArr);

        for(int i =0;i<inputArr.length-1;i++)
        {
            if(inputArr[i]==inputArr[i+1])
            {
                System.out.println("Duplicate Element is :"+ inputArr[i]);
            }

        }

    }

    private static void findDuplicatesUsingHashSet(int[] inputArr) {

        HashSet<Integer> hashSet= new HashSet<>();
        for(int elem: inputArr){

            if(!hashSet.add(elem))
            {
                System.out.println("Duplicate Element:  "+elem);
            }
        }
    }

    private static void findDuplicatesUsingHashMap(int[] inputArr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int element : inputArr)
        {
            if(map.get(element)==null)
            {
                map.put(element,1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }


    }

    private static void findDuplicatesUsingJava8(int[] inputArray)
    {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }
}
