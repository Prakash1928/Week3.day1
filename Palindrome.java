package week3.day1;



public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not

		// * Pseudo Code
		
		 //* a) Declare A String value as"madam"
		 
		String value = "madam";
		
		// * b) Declare another String rev value as ""
		String rev = "";
		
		// * c) Iterate over the String in reverse order (Reverse for Loop)
		for (int i = value.length()-1; i >=0 ; i--) {
			rev = rev + value.charAt(i);
			}
		
		
		// * d) Add the char into rev
		// * e) Compare the original String with the reversed String, if it is same then print palinDrome  
		if (value.equals(rev)) {
			System.out.println("The given string is palindrome");
			
		} else {
			System.out.println("the given string is not a palindrome");

		}
		
		// * Hint: Use .equals or .equalsIgnoreCase when you compare a String 

	}

}
