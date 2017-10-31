import java.util.HashSet;

//Write an algorithm to determine if a number is "happy".
public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isHappy(18));
		
	}
	public static boolean isHappy(int n) {
	    HashSet<Integer> set = new HashSet<Integer>();
	 
	    while(!set.contains(n)){
	        set.add(n);
	 
	        n = getSum(n);
	 
	        if(n==1)
	            return true;
	    }
	 
	    return false;
	} 
	public static int getSum(int n){
	    int sum =0;
	    while(n>0){
	        sum+=(n%10)*(n%10);
	        n=n/10;
	    } 
	    return sum;    
	}
}
