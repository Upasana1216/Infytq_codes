package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class PronicSeries {
	 static boolean isPronic(int number)
	 {
		 int sqrtNum = (int) Math.sqrt(number);
		 int product = sqrtNum * (sqrtNum + 1);
		 if (product == number)
			 return true;
		 else
			 return false;
	 }
	 public static void main(String[] args)throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String input = br.readLine();
		 int len = input.length();
		 HashSet<Integer> pronicList = new HashSet<>();
		 for(int i = 0 ; i < len ; i++)
		 {
			 int number = Integer.parseInt(input.charAt(i)+"");
			 if(isPronic(number) && number!=0)
			 {
				 pronicList.add(number);
			 }
			 for(int j = i+1 ; j < len ; j++)
			 {
				 int digit = Integer.parseInt(input.charAt(j)+""); //6
				 number = number * 10 + digit; //5*10+6->56
				 if(isPronic(number))
				 {
					 pronicList.add(number);
				 }
			 }
		 }
		 ArrayList<Integer> sorted = new ArrayList<>(pronicList); // converting set into ArrayList
		 Collections.sort(sorted);
		 for(int p : sorted)
		 {
			 System.out.print(p+" ");
		 }
 }
}