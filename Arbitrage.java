
// Arbitrage

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arbitrage {
    
	 static int[] arbitrage(String[] quotes) {
        
        int transactionMoney=100000;
        int size=quotes.length;
        int[] res=new int[size];
        
        //String[] tmp=new String[3];
        for(int i=0;i<size;i++){
            String[] tmp=quotes[i].split("\\s+");
            
            double usdEuroRate=Double.parseDouble(tmp[0]);
            double euroGbpRate=Double.parseDouble(tmp[1]);
            double gbpUsdRate=Double.parseDouble(tmp[2]);
        
            double usdEuroCost=transactionMoney/usdEuroRate;
            double euroGbpCost=transactionMoney/euroGbpRate;
            double gbpUsdCost=transactionMoney/gbpUsdRate;
            
            int totalProfit=(int)gbpUsdCost-transactionMoney;
            int arbitrage=(totalProfit<=0)?0:totalProfit;
            
            res[i]=arbitrage;
            
        }
        return res;

    }

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("C:/Users/rashmi/Desktop/Jesus_ToLearn/java/PractiseInterview/input000.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        
        int _quotes_size = 0;
        _quotes_size = Integer.parseInt(in.nextLine().trim());
        String[] _quotes = new String[_quotes_size];
        String _quotes_item;
        for(int _quotes_i = 0; _quotes_i < _quotes_size; _quotes_i++) {
            try {
                _quotes_item = in.nextLine();
            } catch (Exception e) {
                _quotes_item = null;
            }
            _quotes[_quotes_i] = _quotes_item;
        }
        
        res = arbitrage(_quotes);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}