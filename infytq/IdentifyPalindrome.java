package infytq;

import java.util.*;

class IdentifyPalindrome {

	public static int reverse(int num) {
		StringBuilder string = new StringBuilder(Integer.toString(num));
		string.reverse();
		return Integer.parseInt(string.toString());
	}

	public static boolean isPalindrome(int num) {
		return num == reverse(num);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(true) {
			num = num + reverse(num);
			if(isPalindrome(num)) {
				System.out.println(num);
				break;
			}
		}
		
	}
}

