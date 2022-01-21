package infytq;

import java.io.*;
import java.util.*;

class TeamDivision {
    
    public static int solve(int[] arr, int n, int S1, int S2, int lenS1, int lenS2) {
        if (n < 0) {
            if(Math.abs(lenS2 - lenS1) > 1) {
                return Integer.MAX_VALUE;
            }
            return Math.abs(S2 - S1);
        }
        return Math.min(solve(arr, n - 1, S1, S2, lenS1, lenS2),
                        solve(arr, n - 1, S1 + arr[n], S2 - arr[n], lenS1 + 1, lenS2 - 1));
    }
    
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String string = scan.nextLine();
		String[] st = string.split(",");
		int n = st.length;
		int arr[] = new int[n];
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
		    arr[i] = Integer.parseInt(st[i]);
		    totalSum += arr[i];
		}
		int min = solve(arr, n - 1, 0, totalSum, 0, n);
		System.out.println((int)(totalSum/2f - min/2f) + " " + (int)(totalSum/2f + min/2f));
	}
}