package collectionz;

//Java program to find number of subarrays
//with odd sum
import java.util.*;

class OddSum{
	
	//Function to find number of
	//subarrays with odd sum
	static int countOddSum(int a[], int n)
	{
		
		// 'odd' stores number of odd numbers
		// upto ith index
		// 'c_odd' stores number of odd sum
		// subarrays starting at ith index
		// 'Result' stores the number of
		// odd sum subarrays
		int c_odd = 0, result = 0;
		boolean odd = false;
		
		// First find number of odd sum
		// subarrays starting at 0th index
		for(int i = 0; i < n; i++)
		{
			if (a[i] % 2 == 1)
			{
				odd = !odd;
			}
			if (odd)
			{
				c_odd++;
			}
		}
	
		// Find number of odd sum subarrays
		// starting at ith index add to result
		for(int i = 0; i < n; i++)
		{
			result += c_odd;
			if (a[i] % 2 == 1)
			{
				c_odd = (n - i - c_odd);
			}
		}
		return result;
}

//Driver code
public static void main(String[] args)
{
	int ar[] = { 5, 4, 4, 5, 1, 3 };
	int n = ar.length;

	System.out.print("The Number of Subarrays " + "with odd sum is " + countOddSum(ar, n));
}
}

