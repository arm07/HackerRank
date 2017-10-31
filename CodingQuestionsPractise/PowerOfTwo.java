
public class PowerOfTwo {

	//Given an integer, write a function to determine if it is a power of two.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPowerOfTwo(17));	
	}
	/* Function to check if x is power of 2*/
	static boolean isPowerOfTwo(int n)
	{
	  if (n == 0)
	    return false;
	  while (n != 1)
	  {
	    if (n%2 != 0)
	      return false;
	    n = n/2;
	  }
	  return true;
	}
}
