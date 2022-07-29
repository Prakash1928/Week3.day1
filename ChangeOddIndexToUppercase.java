package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		//* Declare String Input as Follow
		  //* String test = "changeme";
		
		String test = "changeme";
		 
		//* a) Convert the String to character array
				
			char[] charArray = test.toCharArray();
			
		 //* b) Traverse through each character (using loop)
		 // * c)find the odd index within the loop (use mod operator)
		 // * d)within the loop, change the character to uppercase, if the index is odd else don't change
	System.out.println("Result : ");
	for (int i = 0; i < charArray.length; i++) {
		if (i%2!=0) {
			System.out.print(Character.toUpperCase(charArray[i]));
		} else {System.out.print(Character.toLowerCase(charArray[i]));

		}
	//for (int i = 0; i < charArray.length; i++) {
	//	if (i%2!=0) {
	//	charArray[i] = Character.toUpperCase(charArray[i]);
	//   }
	//		System.out.print(charArray[i]);
	//	syso out statment is outside loop hence Ch
	
		
	}
	
	}

}


