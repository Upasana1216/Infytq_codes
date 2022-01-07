package singh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1 {
    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(",");
        
        int num1 = 0;
        String num2 ="";
        int n = str.length;
        int arr[] = new int[n];
        int fiveIndex = -1;
        int eightIndex = -1;
        for (int i = 0; i < n; i++) //converting string array into Integer array.
        {
            arr[i] = Integer.parseInt(str[i]);
            if (arr[i] == 5) // finding index of 5 in array
                fiveIndex = i;
            else if (arr[i] == 8)
                eightIndex = i; // finding index of 8 in array
        }
        for (int i = fiveIndex; i <= eightIndex; i++) {
            num2 += str[i]; //concatenating all values between 5 and 8 in the array.
            arr[i] = 0; //after concatenation we are assigning zero at that index because
            //we don’t need that value any more.
        }
        for (int num: arr) {
            num1 += num; //here we are adding all values. we have assigned zero in above loop
            //between fiveIndex and eightIndex in the arr.so it will add remaining outer values.
        }
        System.out.println(num1 + (Integer.parseInt(num2))); //print the sum!
    }

}