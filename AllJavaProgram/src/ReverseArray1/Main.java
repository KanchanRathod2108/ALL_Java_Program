package ReverseArray1;

public class Main {

	public static void main(String[] args) 
	{
		Integer[] intArray = {2,4,6,9,3,5,8};
		
		System.out.print("Original Array: "); //print array starting from first element
		
		for(int i=0; i< intArray.length ;i++)
			
			System.out.print(intArray[i] + "  ");
		
		System.out.println();
		
		
	System.out.print("Original Array printes in revser order: "); //print array starting from last element
	
	for(int i=intArray.length-1;i>=0;i--)
		
		System.out.print(intArray[i] + "  ");
	

	}

}
