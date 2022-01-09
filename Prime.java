package collectionz;

//Java code to print sexy prime in a range.
import java.util.Arrays;
import java.util.Collections;

class Prime
{ 
 // Print the sexy prime in a range
 public static void sixprime(int l, int r) 
 {
     // Sieve Of Eratosthenes for generating
     // prime number.
     boolean [] prime= new boolean[r + 1];
     
     // memset(prime, true, sizeof(prime));
     Arrays.fill(prime, true);
     

     for (int p = 2; p * p <= r; p++)
     {
         // If prime[p] is not changed, 
         // then it is a prime
         if (prime[p] == true) 
         {
             // Update all multiples of p
             for (int i = p * 2; i <= r; i += p)
                 prime[i] = false;
         }
     }

     // From L to R - 6, checking if i,
     // i + 6 are prime or not.
     for (int i = l; i <= r - 6; i++) 
         if (prime[i] && prime[i + 6])
             System.out.print( "(" + i + ", "  + (i + 6) + ") "); 
 }

 // Driver program to test above methods 
 public static void main(String[] args)
 {
     int L = 6, R = 59;
     sixprime(L, R);
 }
}
