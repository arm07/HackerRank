
import java.awt.List;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class SearchEngine {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
		ArrayList<String[]> keys = new ArrayList<String[]>();
		
		//String arg1=args[0],arg2=args[1];
		//
		Reader in = new FileReader(args[0]);
		Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
		for (CSVRecord record : records) {
		    String id = record.get(0);
		    String title = record.get(1);
		    String body = record.get(2);
		    String[] s = new String[2];
		    s[0] = id;
		    s[1] = title;
		    keys.add(s);
		    int index = keys.size()-1; 
		    String[] tags = title.split(" ");
		    for (String t : tags){
		    	if (!map.containsKey(t.toLowerCase())){
		    		HashSet<Integer> set=new HashSet<Integer>();  
		    		map.put(t.toLowerCase(), set);
		    	}
		    	map.get(t.toLowerCase()).add(index);
		    }
		    tags = body.split(" ");
		    for (String t : tags){
		    	if (!map.containsKey(t.toLowerCase())){
		    		HashSet<Integer> set=new HashSet<Integer>();  
		    		map.put(t.toLowerCase(), set);
		    	}
		    	map.get(t.toLowerCase()).add(index);
		    }
		}
		//
		String search = args[1];
		HashSet<Integer> set = new HashSet<Integer>();
		for(String s : search.split(" ")){
			for(int i : map.get(s.toLowerCase())){
				set.add(i);
			}
			
		}
		for (int i : set){
			System.out.println(keys.get(i)[0]+","+keys.get(i)[1]);
		}
	}
}
