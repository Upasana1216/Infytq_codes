package collectionz;

//Java program to find 
//largest Fibonacci subset
import java.util.*;

class FibionaciiList
{
 // Prints largest subset of an array whose
 // all elements are fibonacci numbers
	 public static void findFibSubset(Integer[] x)
	 {
	     Integer max = Collections.max(Arrays.asList(x));
	     List<Integer> fib = new ArrayList<Integer>(); 
	     List<Integer> result = new ArrayList<Integer>();
	     
	     // Generate all Fibonacci numbers 
	     // till max and store them
	     Integer a = 0;
	     Integer b = 1;
	     while (b < max){
	         Integer c = a + b;
	         a=b;
	         b=c;
	         fib.add(c);
	     }
	 
	     // Now iterate through all numbers and
	     // quickly check for Fibonacci
	     for (Integer i = 0; i < x.length; i++){
		     if(fib.contains(x[i])){
		         result.add(x[i]); 
		     }     
	     }
	     System.out.println(result);
	 }
	
	 // Driver code
	 public static void main(String args[])
	 {
	     Integer[] a = {4, 2, 8, 5, 20, 1, 40, 13, 23};
	     findFibSubset(a);
	 }
}



