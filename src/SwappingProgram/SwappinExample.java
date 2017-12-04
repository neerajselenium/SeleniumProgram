package SwappingProgram;

public class SwappinExample {
	
	public static void main(String args[])
	{
		
		int i=10,j=20;
		
		System.out.println("Before swapping ");
		System.out.println("i :"+ i);
		System.out.println("i :"+ j);
		i = i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("After swapping ");
				
				System.out.println("i :"+ i);
				System.out.println("i :"+ j);
		
	}

}
