import java.util.HashMap;

//Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

public class FractionToResult {
	
	public static void main(String[] args)
    {
        int num=2,den=3;
        System.out.println(fractionToDecimal(num,den));
    }
	public static String fractionToDecimal(int numerator, int denominator) {
		
		if (numerator == 0)
			return "0";
		if (denominator == 0)
			return "";
	 
		String res1="";
		// is result is negative
		if(numerator<0 ^denominator<0)
			res1+="-";
		
		// convert int to long
		long nume=numerator,denom=denominator;
		nume=Math.abs(nume);
		denom=Math.abs(denom);
		
		
		// quotient 
		long ans=nume/denom;
		res1+=String.valueOf(ans);
		
		long remain=(nume%denom)*10;
		if(remain==0)
			return res1;
		// right-hand side of decimal point
		HashMap<Long,Integer> x=new HashMap<Long,Integer>();
		res1+=".";
		while(remain!=0){
			if(x.containsKey(remain)){
				int tmp=x.get(remain);
				String p1=res1.substring(0,tmp);
				String p2=res1.substring(tmp,res1.length());
				res1=p1+"("+p2+")";
				return res1;
			}
			x.put(remain, res1.length());
			ans=remain/denom;
			res1+=String.valueOf(ans);
			remain=(remain%denom)*10;		
		}
		
		return res1;	
	}
}
