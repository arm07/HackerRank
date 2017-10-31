
/*
Given a range [m, n] where 0 <= m <= n <= 2147483647,
return the bitwise AND of all numbers in this range, 
	inclusive. For example, given the range [5, 7], you should return 4.*/
			
public class BitwiseAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(rangeBitwiseAnd(5,7));
	}
	
	public static int rangeBitwiseAnd(int m, int n) {
	     while (n > m) {
	    	  //System.out.print(n);
	          n = n & n - 1;
	     }
	     return m & n;
	}
}
