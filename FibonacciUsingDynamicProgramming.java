import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     static BigInteger fib(Map<Integer, BigInteger> fibonacciTable,int n){
         
         if(fibonacciTable.containsKey(n)) {
			return fibonacciTable.get(n);
		}
		
        BigInteger lastNumFibonacci = fib(fibonacciTable,n-1);
        BigInteger numFibonacci = lastNumFibonacci.multiply(lastNumFibonacci).add(fib(fibonacciTable,n-2));
         
        fibonacciTable.put(n,numFibonacci);
        return numFibonacci;
        /*double[] f=new double[n+1];
        int i;
        f[0]=f1;
        f[1]=f2;
        //System.out.println(f2);
        for(i=2;i<=n;i++){
            f[i]=f[i-2]+(f[i-1]*f[i-1]);         
        }
        int fres=(int)f[n-1];
        System.out.println(fres);
        return f[n-1];*/
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        BigInteger f1=BigInteger.valueOf(scan.nextLong());
        BigInteger f2=BigInteger.valueOf(scan.nextLong());
       
        Map<Integer, BigInteger> fibonacciTable = new HashMap<>();
        fibonacciTable.put(1, f1);
	fibonacciTable.put(2, f2);
		
        int n=scan.nextInt();
        
        System.out.println(fib(fibonacciTable,n));
       
    }
}