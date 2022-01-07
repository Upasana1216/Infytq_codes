package singh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
public class Question4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String strArr[] = br.readLine().split(",");
        int len = strArr.length;
        HashSet < Integer > hs = new HashSet < > ();
        
        for (int i = 0; i < len; i++) {
            hs.add(Integer.parseInt(strArr[i]));
        }
        
        System.out.println(hs.size() - n);
    }
}
