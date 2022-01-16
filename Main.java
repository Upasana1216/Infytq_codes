package infytq;

import java.util.Arrays;

class Main
{
    // Function to print all quadruplet present in an array with a given sum
    public static void quadTuple(int[] A, int target)
    {
        // sort the array in ascending order
        Arrays.sort(A);
 
        // check if quadruplet is formed by `A[i]`, `A[j]`, and a pair from
        // subarray `A[j+1…n)`
        for (int i = 0; i <= A.length - 4; i++)
        {
            for (int j = i + 1; j <= A.length - 3; j++)
            {
                // `k` stores remaining sum
                int k = target - (A[i] + A[j]);
 
                // check for sum `k` in subarray `A[j+1…n)`
                int low = j + 1, high = A.length - 1;
 
                while (low < high)
                {
                    if (A[low] + A[high] < k) {
                        low++;
                    }
                    else if (A[low] + A[high] > k) {
                        high--;
                    }
                    // quadruplet with a given sum found
                    else {
                        System.out.println("(" + A[i] + " " + A[j] + " " + A[low] + " " + A[high] + ")");
                        low++;
                        high--;
                    }
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 20;
 
        quadTuple(A, target);
    }
}
