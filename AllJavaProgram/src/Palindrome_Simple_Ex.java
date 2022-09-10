
public class Palindrome_Simple_Ex {

	public static void main(String[] args) {
		String myString = "NAYAN";
		StringBuffer buffer = new StringBuffer (myString);
		buffer.reverse();
		String data = buffer.toString();
		if(myString.equals(data)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
