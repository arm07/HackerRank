
/* Hack land Election*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackLandElection {
    
	
	
    static String electionWinner(String[] votes) {
        
        int size=votes.length;
        int[] count=new int[size];
        String[] votesTmp=new String[size];
        String tmp;
        //To initialse a cont array and to copy values in temp string
        for(int i=0;i<size;i++){
             count[i]=0;
             votesTmp[i]=votes[i];
        }
        // To sort the strings of candidates alphabetically in descending order
        for(int i=0;i<votesTmp.length;i++)
        {   
            for(int j=i+1;j<votesTmp.length;j++){
                
                if(votesTmp[i].compareTo(votesTmp[j])<0){
                    tmp=votesTmp[i];
                    votesTmp[i]=votesTmp[j];
                    votesTmp[j]=tmp;
                }       
            }
        }
        //to count the number of votes for each candidate
        for(int i=0;i<votesTmp.length;i++)
        {   
            String temp1=votesTmp[i];
            for(int j=i+1;j<votes.length;j++){
               String temp2=votes[j];
                if(temp1.equals(temp2))
                    count[i]+=1;          
            }
        }
        
        //To find the max count and retrieve the candidate corresponding to it
        int max=count[0];
        for(int i=1;i<count.length;i++){
            if(count[i]>max)
                max=count[i];
        }
        return votesTmp[max];
    }


	 public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        
        int _votes_size = 0;
        _votes_size = Integer.parseInt(in.nextLine().trim());
        String[] _votes = new String[_votes_size];
        String _votes_item;
        for(int _votes_i = 0; _votes_i < _votes_size; _votes_i++) {
            try {
                _votes_item = in.nextLine();
            } catch (Exception e) {
                _votes_item = null;
            }
            _votes[_votes_i] = _votes_item;
        }
        
        res = electionWinner(_votes);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }
}