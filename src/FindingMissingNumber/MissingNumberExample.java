package FindingMissingNumber;

public class MissingNumberExample {

	public static void main(String[] args) {
	
		
		int arr[]= {1,2,4,5,6,7};
		
		int sum=0;
		
		for(int i =0;i<arr.length;i++)
		{
			sum= sum + arr[i];
		}

		System.out.println("Sum of array: " + sum);
		
		
		int totalSum=0;
		for(int j=1;j<=7;j++)
		{
			totalSum= totalSum + j;
			
		}
		
		System.out.println("total sum of numbers: "+ totalSum);
	
		System.out.println("Missing Number is: "+ (totalSum - sum) );
	}

}
