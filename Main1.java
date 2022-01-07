package singh;

import java.util.*;
class Main1
{ 
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    
    int n=sc.nextInt();
    int arr1[]= new int[n];
    int arr2[]= new int[n];
   
   
    for(int i=0; i<n; i++)
       arr1[i]=sc.nextInt();
       
    for(int i=0; i<n; i++)
       arr2[i]=sc.nextInt();
       
    for(int i=0; i<n; i++)
       arr1[i] -= arr2[i];
       
    Arrays.sort(arr1);
    
    int sum=0, ans=0;
    
    for(int i=n-1; i>=0; i--)
    {
        sum+=arr1[i];
        if(sum<0)
        {
         sum = -sum;
         ans= ans +sum ;
         sum=0;
        }
    }
    
    
    System.out.println(ans);
  }
 }