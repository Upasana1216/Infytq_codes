package collectionz;

import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int flag=0;
        for(int i=1; i<n ; i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
            
            if(i*(i+1)>n)
            	break;
        }
        
        if(flag==1)
            System.out.println(n + " is a pronic number");
        else
            System.out.println(n + " is not a pronic number");
    }
}