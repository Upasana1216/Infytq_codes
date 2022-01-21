package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Question3 {
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
	
	 ArrayList<Integer>list=new ArrayList<>();
	 for (int r=0;r<row;r++)
	 {
		 for(int c=0;c<column;c++){
			 if(c < column-3) //condition for cosecutive numbers in all rows in matrix
			 {
				 if(matrix[r][c]==matrix[r][c+1] && matrix[r][c+2]==matrix[r][c+3] && matrix[r][c+1]==matrix[r][c+2])
					 list.add(matrix[r][c]);
			 }
			 if(r < row-3) // #condition for cosecutive numbers in all columns in matrix
			 {
				 if(matrix[r][c]==matrix[r+1][c] && matrix[r+2][c]==matrix[r+3][c] && matrix[r+1][c]==matrix[r+2][c])
					 list.add(matrix[r][c]);
			 } 
			 if(c < column-3 && r >= 3) //#cosecutive numbers in all left to right diagonals in matrix
			 {
				 if(matrix[r][c]==matrix[r-1][c+1] && matrix[r-2][c+2]==matrix[r-3][c+3] && matrix[r-1][c+1]==matrix[r-2][c+2])
					 list.add(matrix[r][c]);
			 }
			 if(c >= 3 && r >= 3) // #cosecutive numbers in all left to right diagonals in matrix
			 {
				 if(matrix[r][c]==matrix[r-1][c-1] && matrix[r-2][c-2]==matrix[r-3][c-3] && matrix[r-1][c-1]==matrix[r-2][c-2])
					 list.add(matrix[r][c]);
			 }
	 }
	 }
	 if(list.size()==0)
		 System.out.println("-1");
	 else
		 System.out.println(Collections.min(list));
}
}
