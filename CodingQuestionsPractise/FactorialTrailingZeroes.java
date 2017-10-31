
//Given an integer n, return the number of trailing zeroes in n!.
public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(trailingZeroes(18));
	}
	public static int trailingZeroes(int n) {
		if (n < 0)
			return -1;
	 
		int count = 0;
		for (long i = 5; n / i >= 1; i *= 5) {
			count += n/i;
		} 
		return count;
	}
}
