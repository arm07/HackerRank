
//Given a positive integer, return its corresponding column title as appear in an Excel sheet. For example:

public class ExcelNumberToTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(convertToTitle(54));
	}
	
	public static String convertToTitle(int n) {
	    if(n <= 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	 
	    StringBuilder sb = new StringBuilder();
	 
	    while(n > 0){
	        n--;
	        char ch = (char) (n % 26 + 'A');
	        n /= 26;
	        sb.append(ch);
	    }
	 
	    sb.reverse();
	    return sb.toString();
	}

}
