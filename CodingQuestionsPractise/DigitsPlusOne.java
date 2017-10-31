
/*Given a non-negative number represented as an array of digits, plus one to the number.
 The digits are stored such that the most significant digit is at the head of the list.
*/

public class DigitsPlusOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,9,9};
		int res[]=plusOne(num);
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j]);
		}	
	}	
	public static int[] plusOne(int[] digits) {
	    if(digits==null||digits.length==0)
	        return new int[0];
	 
	    int carry = 1;    
	    for(int i=digits.length-1; i>=0; i--){
	        int sum = digits[i]+carry;
	        if(sum>=10){
	            carry=1;
	        }else{
	            carry=0;
	        }
	        digits[i]=sum%10;
	    }
	 
	    if(carry==1){
	        int[] result = new int[digits.length+1];
	        System.arraycopy(digits, 0, result, 1, digits.length);
	        result[0]=1;
	        //System.out.print(result);
	        return result;
	    }else{
	        //int[] result = new int[digits.length];
	    	//System.out.print(digits[0]);
	        return digits;
	    }
	}
}
