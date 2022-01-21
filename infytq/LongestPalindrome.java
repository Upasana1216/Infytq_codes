package infytq;

import java.util.HashMap;
import java.util.Map;
 
class LongestPalindrome
{
    // Construct the longest palindrome by shuffling or deleting
    // characters from a given string
    public static String longestPalindrome(String str)
    {
        // base case
        if (str == null || str.length() == 0) {
            return str;
        }
 
        // create a frequency map for characters of a given string
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch: str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
 
        String mid_char = "";                  // stores odd character
        StringBuilder left = new StringBuilder();   // stores left substring
 
        // iterate through the frequency map
        for (var entry: freq.entrySet())
        {
            char ch = entry.getKey();               // get current character
            int count = entry.getValue();           // get character frequency
 
            // if the current character's frequency is odd,
            // update mid to current char (and discard the old one)
            if (count % 2 == 1) {
                mid_char = String.valueOf(ch);
            }
 
            // append half of the characters to the left substring
            // (the other half goes to the right substring in reverse order)
            left.append(String.valueOf(ch).repeat(count / 2));
        }
 
        // the right substring will be the reverse of the left substring
        StringBuilder right = new StringBuilder(left).reverse();
 
        // return string formed by the left substring, mid-character (if any),
        // and the right substring
        return ("" + left + mid_char + right);
    }
 
    public static void main(String[] args)
    {
        String str = "ABBDAB";
        System.out.print("The longest palindrome is " + longestPalindrome(str));
    }
}

