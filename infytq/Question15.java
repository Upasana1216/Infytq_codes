package infytq;

import java.util.Scanner;
public class Question15 {
 static boolean isAlphaNumeric(char ch )
 {
	 if(ch >= 'a' && ch <= 'z')
		 return true;
	 else if(ch >= 'A' && ch <= 'Z')
		 return true;
	 else if(ch >= '0' && ch <= '9')
		 return true;
	
	 return false;
 }

 public static void main(String[] args)throws Exception {
	 Scanner kb = new Scanner(System.in);
	 String input = kb.nextLine();
	 int len = input.length();
	 char reverse[] = new char[len];
	 int idx = 0;
	 StringBuilder sb = new StringBuilder();
	 String rev="";
	 for(int i = len-1 ; i >= 0 ; i--)//reverse traversing
	 {
		 if(isAlphaNumeric(input.charAt(i)))
		 {
			 sb.append(input.charAt(i));
		
		 }
	 }
	 for(int i = 0 ; i < len ; i++)
	 {
		 if(!isAlphaNumeric(input.charAt(i)))
			 sb.insert(i,input.charAt(i));
		 }
		 System.out.print(sb);
	 }
}