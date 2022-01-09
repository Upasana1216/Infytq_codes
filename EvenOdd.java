package collectionz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class EvenOdd {
	
public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		int sc=0;
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

    
		for(int i=0;i<s.length();i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				sc++;
			}
			
			
			if(Character.isDigit(s.charAt(i))){
				String dig = String.valueOf(s.charAt(i));
				int num=Integer.parseInt(dig);
				if(num%2==0)
					even.add(num);
				else
					odd.add(num);
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(sc%2==0)
		{
			for(int i=0;i<Math.max(even.size(),odd.size());i++) {
				
				if(i<even.size()) {
					ans.add(even.get(i));
				}
				if(i<odd.size()) {
					ans.add(odd.get(i));
				}	
			}
		}else
		{
			for(int i=0;i<Math.max(even.size(),odd.size());i++) {
				
				
				if(i<odd.size()) {
					ans.add(odd.get(i));
				}	
				if(i<even.size()) {
					ans.add(even.get(i));
				}
			}
		}
		
		
		//for(int i=0;i<ans.size();i++) {
			System.out.println(ans);
		
	}
}
