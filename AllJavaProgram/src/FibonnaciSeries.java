
public class FibonnaciSeries {

	public static void main(String[] args) {
		int n = 10, a = 0, b=0, c = 1;
		System.out.print("Fibonacci series:");
		for(int i = 0; i< n; i++)
		{
			a= b;
			b=c;
			c=a+b;
			System.out.print(a+ " ");
		}

}
}