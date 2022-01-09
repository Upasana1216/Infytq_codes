package collectionz;

import java.util.Scanner;
public class MinimumGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
        	
            int n = sc.nextInt();
            int[] ar = new int[n];
            
            for (int i = 0; i < n; i++)
                ar[i] = sc.nextInt();
            
            int[] gifts = new int[n];
            
            gifts[0] = 1;
            // Left to Right Neighbors
            for (int i = 1; i < n; i++) {
                if (ar[i] > ar[i - 1])
                   gifts[i] = gifts[i - 1] + 1;
                else
                    gifts[i] = 1;
            }
            // Right to Left Neighbors
            for (int i = n - 2; i >= 0; i--) {
            	
                if (ar[i] > ar[i + 1] && gifts[i] <= gifts[i + 1])
                    gifts[i] = gifts[i + 1] + 1;
            }
            long total = 0;
            for (int gift : gifts)
                total += gift;
            System.out.println(total);
        }
    }
}