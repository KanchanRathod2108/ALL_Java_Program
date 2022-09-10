import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class ArraylistRevese {

	public static void main(String[] args) 
	{
		
		String[] arrayColr = {"RED","BLUE","PINK","BLACK","WHITE"};
		
		System.out.println("Array Before: " +Arrays.toString(arrayColr));
		
		List<String> arrayNewColor = Arrays.asList(arrayColr);
		
		Collections.reverse(arrayNewColor);
		String[] reversed = arrayNewColor.toArray(arrayColr);
		
		System.out.println("Array Reverse: " +Arrays.toString(reversed));
		
	}

}
