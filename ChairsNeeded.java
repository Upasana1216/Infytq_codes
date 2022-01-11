package collectionz;

//Java program for the above approach
import java.io.*;
import java.util.*;

class ChairsNeeded
{

	//Function to find the minimum number
	//of chairs required to ensure that
	//every worker is seated at any time
	static int findMinimumChairs(String s)
	{
		
		// Stores the number of
		// chairs required
		int count = 0;
	
		// Pointer to iterate
		int i = 0;
	
		// Stores minimum number of
		// chairs required
		int mini = Integer.MIN_VALUE;
	
		// Iterate over every character
		while (i < s.length()) {
	
		// If character is 'E'
		if (s.charAt(i) == 'E')
	
			// Increase the count
			count++;
	
		// Otherwise
		else
			count--;
	
		// Update maximum value of count
		// obtained at any given time
		mini = Math.max(count, mini);
	
		i++;
		}
	
		// Return mini
		return mini;
	}
	
	//Driver code
	public static void main(String[] args)
	{
		// Input
	
		// Given String
		String s = "EELEE";
	
		// Function call to find the
		// minimum number of chairs
		System.out.print(findMinimumChairs(s));
	}
}


