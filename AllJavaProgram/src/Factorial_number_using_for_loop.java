
public class Factorial_number_using_for_loop {

	public static void main(String[] args) {
		int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

	}


