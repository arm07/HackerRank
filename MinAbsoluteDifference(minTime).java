import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int minDiff=1000;
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(a);
        /*for(int a_i=0; a_i < n; a_i++){
           System.out.print(a[a_i]); 
        }*/
     
        for(int i=0;i<n-1;i++){
            if(Math.abs(a[i]-a[i+1])<minDiff)               
                minDiff=Math.abs(a[i]-a[i+1]);
        }
        System.out.println(minDiff);
    }
}
