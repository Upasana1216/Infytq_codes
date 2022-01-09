package collectionz;

//Java program for the above approach

import java.io.*;

class KthLargestFactor {

	// Function to print Kth largest
	// factor of N
	static int LargestFactor(int N, int K)
	{
		// Check for numbers
		// in the range [N, 1]
		for (int i = N; i > 0; i--) {

			// Check if i is a factor of N
			if (N % i == 0)

				// If Yes, reduce K by 1
				K--;

			// If K is 0, it means
			// i is the required
			// Kth factor of N
			if (K == 0) {
				return i;
			}
		}

		// When K is more
		// than the factors of N
		return -1;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int N = 12, K = 3;
		System.out.println(LargestFactor(N, K));
	}
}

