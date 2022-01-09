package collectionz;

//Java implementation of the approach
import java.util.*;
public class Parenthesis
{
	public static void main(String[] args)
	{
	
		// Defining the string
		String string = "{[)]";
		
		// Storing opening braces in list lst1
		char[] lst1 = {'{', '(', '['};
	
		// Storing closing braces in list lst2
		char[] lst2 = {'}', ')', ']'};
	
		// Creating an empty list lst
		Vector<Character> lst = new Vector<Character>();
		
		// Creating dictionary to map
		// closing braces to opening ones
		HashMap<Character, Character> Dict = new HashMap<>();
		Dict.put(')', '(');
		Dict.put('}', '{');
		Dict.put(']', '[');
	
		int a = 0, b = 0, c = 0;
	
		// If first position of string contain
		// any closing braces return 1
		if(Arrays.asList(lst2).contains(string.charAt(0)))
		{
			System.out.println(1);
		}
		else
		{
			int k = 0;
			
			// If characters of string are opening
			// braces then append them in a list
			for(int i = 0; i < string.length(); i++)
			{
				if(Arrays.asList(lst1).contains(string.charAt(i)))
				{
					lst.add(string.charAt(i));
					k = i + 2;
				}
				else
				{
					// When size of list is 0 and new closing
					// braces is encountered then print its
					// index starting from 1	
					if(lst.size()== 0 && Arrays.asList(lst2).contains(string.charAt(i)))
					{
						System.out.println((i + 1));
						c = 1;
						break;
					}
					else
					{
						// As we encounter closing braces we map
						// them with theircorresponding opening
						// braces using dictionary and check
						// if it is same as last opened braces
						//(last element in list) if yes then we
						// delete that element from list
						if(lst.size() > 0 && Dict.get(string.charAt(i))== lst.get(lst.size() - 1))
						{
							lst.remove(lst.size() - 1);
						}
						else
						{
							// Otherwise we return the index
							// (starting from 1) at which
							// nesting is found wrong
							a = 1;
							break;
						}
					}
				}
			}
	
			// At end if the list is empty it
			// means the string is perfectly nested			
			if(lst.size() == 0 && c == 0)
			{
				System.out.println(0);
				b = 1;
			}
	
			if(a == 0 && b == 0 && c == 0)
			{
				System.out.println(k);
			}
		}
	}
}


