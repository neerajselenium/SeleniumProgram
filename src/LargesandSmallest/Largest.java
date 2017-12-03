package LargesandSmallest;

public class Largest {

	public static void main(String[] args) {
		
		int arr[]= {5,90,30,4,60,-4};
		
		int size= arr.length;
		int largest = 0,smallast = 0;
		largest= arr[0];
		smallast= arr[0];
		
		for(int i =0;i<arr.length;i++)
		{
			
			
			if(largest<arr[i])
			{
				
				largest = arr[i];
			}
			
			 if (smallast > arr[i])
			{
				smallast=arr[i];
			}
			
		}
		
		System.out.println("largest no is: " + largest);
		System.out.println("smallast no is: " + smallast);
		
	}

}
