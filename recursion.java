import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     static BigInteger factorial(int n, Map<Integer, BigInteger> factTable){
         
         if(factTable.containsKey(n)) {
			return factTable.get(n);
		}
		BigInteger num=BigInteger.valueOf(n);
        BigInteger lastNumFact = factorial(n-1,factTable);
        BigInteger numFact = num.multiply(factorial(n-1,factTable));
         
        factTable.put(n,numFact);
        return numFact;
         
        /*double[] f=new double[n+1];
        int i;
        f[0]=f1;
        f[1]=f2;
        //System.out.println(f2);
        for(i=2;i<=n;i++){
            f[i]=f[i-2]*f[i-1]);         
        }
        int fres=(int)f[n-1];
        System.out.println(fres);
        return f[n-1];*/
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        BigInteger f1=BigInteger.valueOf(1);
        BigInteger f2=BigInteger.valueOf(2);
       
        Map<Integer, BigInteger> factTable = new HashMap<>();
        factTable.put(1, f1);
		factTable.put(2, f2);
		
        int n=scan.nextInt();
        
        System.out.println(factorial(n,factTable));
    }
}