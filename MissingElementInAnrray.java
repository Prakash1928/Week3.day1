package week3.day1;

import java.util.Arrays;

public class MissingElementInAnrray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
	
		
		// Sort the array
		Arrays.sort(arr);
		//{1,2,3,4,6,7,8}
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			
		// check if the iterator variable is not equal to the array values respectively
			if (i+1!=arr[i]) {//0+1=2,1
				
				// print the number	
				System.out.println(i+1);
				
				// once printed break the iteration
				break;
				
			}
			
		}
		
		
		
					
					
					
						
						
		
		
		
		

	}

}
