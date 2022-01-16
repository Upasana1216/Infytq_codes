package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question7{
 public static void main(String[] args)throws Exception {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String str[]=br.readLine().split(",");
	 String password="";
	 for(String obj:str)
	 {
		 String ar[]=obj.split(":");
		 String empName=ar[0];
		 String empNumber=ar[1];
		 int nameLen=empName.length();
		 int numberLen=empNumber.length();
		 int num=-1;
		 for(int i=0;i<numberLen;i++)
		 {
			 int digit=Integer.parseInt(String.valueOf(empNumber.charAt(i)));
			 if(digit<=nameLen && digit > num)
				 num=digit;
		 }
		 if(num==-1)
			 password+="X";
		 else
			 password+=String.valueOf(empName.charAt(num-1));
		
	 }
	 System.out.println(password);
 }}