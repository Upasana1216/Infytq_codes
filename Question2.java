package singh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class Question2 {
    static boolean isDigit(char digit) {
        if (digit >= '0' && digit <= '9') 
        	return true;
        return false;
    }
    
    public static void main(String[] args) throws Exception {
    	
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            StringBuilder sb = new StringBuilder();
            HashSet < Integer > hs = new HashSet < > ();
            
            for (int i = 0; i < input.length(); i++) {
                if (isDigit(input.charAt(i))) {
                    String dig = String.valueOf(input.charAt(i));
                    hs.add(Integer.parseInt(dig));
                }
            }
            
            ArrayList < Integer > digitList = new ArrayList < > (hs);
            Collections.sort(digitList, Collections.reverseOrder());
            
            int len = digitList.size();
            boolean evenDigitFound = false;
            for (int i = len - 1; i >= 0; i--) {
            	
                int digit = digitList.get(i);
                if (digit % 2 == 0) {
                    digitList.remove(i);
                    digitList.add(digit); //adding even digit at end
                    evenDigitFound = true;
                    break;
                }
            }
            if (evenDigitFound == false) {
                System.out.print(-1);
            } else {
                for (int dig: digitList) System.out.print(dig); // printing largest even digits
                
            }
          }}
  
