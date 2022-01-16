package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class MaxSubarray {
 public static void main(String[] args)throws Exception {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String strArr[]=br.readLine().split(",");
	 
	 ArrayList<Integer> list=new ArrayList<>();
	 
	 for(String s:strArr)
		 list.add(Integer.parseInt(s));
	 
	 ArrayList<Integer> longestSeries=new ArrayList<>();
	 int n=list.size();
	 for(int i=0;i<n-1;i++)
	 {
		 int first=list.get(i);
		 int second=list.get(i+1);
		 ArrayList<Integer> fabList=new ArrayList<>();
		 fabList.add(first);
		 fabList.add(second);
		 for (int j=i+2;j<n;j++){
			 int ele=list.get(j);
			 if(first+second==ele){
				 fabList.add(ele);
				 first=second;
				 second=ele;
			 }
		 }
		 if(longestSeries.size()<fabList.size())
			 longestSeries=fabList;
	 }
	 if(longestSeries.size()>2)
	{
		 for(int ele:longestSeries)
			 System.out.print(ele+" ");
	}
	else
		System.out.println("-1");
	 }
}