
public class AmstrongNumber3 {

	
	
		int power(int x ,long y)
		{
			if( y == 0)
				return 1;
			if (y % 2 == 0)
				return power (x , y/2) * power (x , y / 2);
			return x * power (x , y/2) * power (x , y / 2);
		}
		  /* Function to calculate order of the number */
		int order (int x)
		{
			int n = 0 ;
			while (x !=0)
			{
				n++;
				x = x / 10 ;
			}
			return n ;
			
		}
		// Function to check whether the given number is
	    // Armstrong number or not
	boolean isArmstrong (int x)
	{
		int n = order(x);
		int temp = x , sum = 0;
		while (temp != 0)
		{
			int r = temp % 10;
			sum = sum + power (r ,n);
			temp = temp / 10 ;
		}
		return ( sum == x); // If satisfies Armstrong condition
	}
	public static void main(String[] args) 
	{
		AmstrongNumber3 ob = new AmstrongNumber3 (); // object is created
		int x = 153; // number is amstrong that why output is true
		System.out.println(ob.isArmstrong(x));
		x= 1234; // not amstrong that why false result
		System.out.println(ob.isArmstrong(x));
	

		
		
	}

 }

