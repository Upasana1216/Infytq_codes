package collectionz;

import java.util.*;
import java.io.*;
public class OTP {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String s1="";
		for(int i=1;i<s.length();i=i+2){
			
			s1+=Integer.parseInt(""+s.charAt(i))*Integer.parseInt(""+s.charAt(i));
		}
		System.out.println(s1.substring(0,4));
	}
}
