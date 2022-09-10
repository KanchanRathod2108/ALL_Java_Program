import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		System.out.print("Enter the string you want to check:");
	        
	        Scanner sc = new Scanner(System.in);
	          String name = sc.next();
	       //String name=str; //maam
	         
	          String rev="";
	         
	          int leng=name.length();//4
	          
	          for(int i = leng - 1; i >= 0; i--){//3 2 1 0
	              rev = rev + name.charAt(i);//maam
	          }
	          if(name.equals(rev))//maam
	          {
	              System.out.println("The string is palindrome.");
	          }
	          else
	          {
	              System.out.println("The string is not palindrome.");
	          }
	  }

	}
