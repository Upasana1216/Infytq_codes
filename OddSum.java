package infytq;

//Java code to find count of sub-arrays
//with odd sum
import java.io.*;

class OddSum {
	static int countOddSum(int ar[],int n)
	{
		// A temporary array of size 2.
		// temp[0] is going to store
		// count of even subarrays
		// and temp[1] count of odd.
		// temp[0] is initialized as
		// 1 because there a single odd
		// element is also counted as
		// a subarray
		int temp[] = { 1, 0 };

		// Initialize count. sum is
		// sum of elements under modulo
		// 2 and ending with arr[i].
		int result = 0, val = 0;

		// i'th iteration computes sum
		// of arr[0..i] under modulo 2
		// and increments even/odd count
		// according to sum's value
		for (int i = 0; i <= n - 1; i++) {
			// 2 is added to handle
			// negative numbers
			val = ((val + ar[i]) % 2 + 2) % 2;

			// Increment even/odd count
			temp[val]++;
		}

		// An odd can be formed by an even-odd pair
		result = temp[0] * temp[1];

		return (result);
	}

	// Driver code
	public static void main(String[] args)
	{

		int ar[] = { 5, 4, 4, 5, 1, 3 };
		int n = ar.length;

		System.out.println("The Number of Subarrays" + " with odd sum is " + countOddSum(ar, n));
	}
}

