package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Question11 {
 static int Sum(int num)
 {
	 int temp=num;
	 int digSum=0;
	 while(temp!=0)
	 {
		 digSum+=temp%10;
		 temp/=10;
	 }
	 if(num%digSum==0)
		 return 0;
	 else
		 return 1;
 }
 public static void main(String[] args)throws Exception {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String str[]=br.readLine().split(" ");//first line will row and column value separated with space
	 int row=Integer.parseInt(str[0]);
	 int column=Integer.parseInt(str[1]);
	 int matrix[][]=new int[row][column];
	 for(int i=0;i<row;i++)//every iteration we will take a row as an input.
	 {
		 String rowData[]=br.readLine().split(" ");
		 for(int j=0;j<column;j++)
		 {
			 matrix[i][j]=Integer.parseInt(rowData[j]);
		 }
	 }
	 System.out.println("");
	 for (int r=0;r<row-1;r++)
	 {
		 for(int c=0;c<column-1;c++){
			 
			 int num1=Sum(matrix[r][c]);
			 int num2=Sum(matrix[r][c+1]);
			 int num3=Sum(matrix[r+1][c]);
			 int num4=Sum(matrix[r+1][c+1]);
			 if(num1==0 && num2==num3 && num3==num4 ){
				 
				 System.out.println(matrix[r][c]+" "+matrix[r][c+1]);
				 System.out.println(matrix[r+1][c]+" "+matrix[r+1][c+1]);
				 
			 }
		 }
	 }
}
}