package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question5 {
	 public static void main(String[] args)throws Exception {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String str[]=br.readLine().split(",");
		 for(String obj:str)
		 {
			 String ar[]=obj.split(":");
			 String s=ar[0];
			 int number=Integer.parseInt(ar[1]);
			 int digSqSum=0;
			 while(number!=0)//adding every sq of digits
			 {
				 int digit=number%10;
				 digSqSum+=(digit*digit);
				 number/=10;
			 }
			 int lenOfString=s.length();
			 if(digSqSum%2==0)
				 System.out.print(s.charAt(lenOfString-1)+s.substring(0,lenOfString-1)+" ");
			 //first printing last char and then concatenating all char except last
			 else
				 System.out.println(s.substring(2,lenOfString)+s.substring(0,2)+" ");
			 //first printing substring from 3rd position and concatenatiin first two char in it.
			}
	 }
}

