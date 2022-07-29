package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) {
		// *Declare a String 
		//String text1 = "stops";
		//*Declare another String
		//String text2 = "potss"; 
	 //* a) Check length of the strings are same then (Use A Condition)
	// * b) Convert both Strings in to characters
	// * c) Sort Both the arrays
	// * d) Check both the arrays has same value
		
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length()) {
			System.out.println("Length are equal");
		}
		
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text1.toCharArray();
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("the given string is an Anagram");
		} else {
			System.out.println("the given string is Not an Anagram");
		}
		
		
		
				}
						
		}
		




