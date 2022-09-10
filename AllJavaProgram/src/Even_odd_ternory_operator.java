import java.util.Scanner;

public class Even_odd_ternory_operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		String evenOdd = (num % 2 == 0) ? "even" : "odd";
		System.out.print(num + " is " + evenOdd);

	}

}
