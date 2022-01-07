package singh;

import java.util.*;
class Main
{ 
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    
    int n=sc.nextInt();
    int v[]= new int[n];
    int x=sc.nextInt();
   
    for(int i=0; i<n; i++)
       v[i]=sc.nextInt();
    
    for(int i=0;i<n;i++){
        v[i]=(v[i]-1)/x;
        
    }
    
    int m=0, maxPos=0;
    
    for(int i=0;i<n;i++){
        
        if(v[i]>=m){
            m=v[i];
            maxPos=i;
        }
    }
    
    System.out.println(maxPos+1);
  }
 }