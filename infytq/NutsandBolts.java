package infytq;




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class NutsandBolts {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        char[] order = {'!', '#', '$', '%', '&', '*', '@', '^', '~'};
        String nuts1= Arrays.toString(nuts);
        int j=0;
        for(int i=0; i<order.length; i++){
            if(nuts1.contains(Character.toString(order[i])))
            {
                nuts[j] = order[i];
                bolts[j] = order[i];
                j++;
                if(j==n)
                    break;
            }
        }
    }
}
