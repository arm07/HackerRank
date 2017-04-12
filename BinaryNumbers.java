import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        int maxCount=0;
        List<Integer> listNumbers = new ArrayList<Integer>();
        int remainder;
        while(n>0){
            remainder=n%2;
            n=n/2;
            listNumbers.add(remainder);    
        }
        
        //System.out.println(listNumbers);
        for(int i=0;i<listNumbers.size();i++){
            if(listNumbers.get(i)==1)
                count++;
            else
                count=0;
            if(count>maxCount)
                maxCount=count;   
        }
        System.out.println(maxCount);
    }
}