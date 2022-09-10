import java.util.Scanner;

public class Fibonnaci_Series_User_input {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 1;
		System.out.print("Enter value of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Fibonacci series: ");
		for (int i = 0; i<n;i++) {
			a =b;
			b=c;
			c=a+b;
			System.out.print(a + " ");
		}
		

	}

}
