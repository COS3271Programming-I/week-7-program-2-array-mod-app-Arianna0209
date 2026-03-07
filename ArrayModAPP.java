package week7;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayModAPP {

	// This program allows the user to enter an array of integers and then edit that array and sort it.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		// Tell the user what the program does:
		System.out.println("This program allows you to enter an array of integers and edit it as many times as you would like."
				+ "\nThen the program will sort the integers from lowest to highest.");
		
		// Declare the variable for the array length:
		int length;
		
		// Ask the user how long they would like their array to be:
		System.out.print("\nHow many numbers would you like in your array? Pick a number from 1 to 20: ");
		length = userinput.nextInt();
		userinput.nextLine();
			
		// Create the array:
		int[] integers = new int[length];
		
		// Fill the array:
		int num;
		System.out.println("\nEnter the values. Press enter after each integer.");
		for (num = 0; num < length; num++) {
			integers[num] = userinput.nextInt();
			userinput.nextLine();
		}
		
		// Print the array:
		System.out.println("\nYour array of integers is: ");
		System.out.print(Arrays.toString(integers));
			
		// Ask the user if they'd like to search the array:
		System.out.print("\n\nWould you like to replace a number in the array? Type yes or no: ");
		String replace = userinput.nextLine();
		replace = replace.toLowerCase();
		
		// Search the string if the user wants to:
		while (replace.equals("yes")) {
			// Ask the user which number they'd like to replace:
			System.out.print("\nEnter the number you would like to replace: ");
			int target = userinput.nextInt();
			userinput.nextLine();
			
			// Ask the user what they'd like to replace the number with:
						System.out.format("\nWhat would you like to replace %d with? ", target);
						int targetReplacement = userinput.nextInt();
						userinput.nextLine();
			
			// Search the string for the target number to find its index and replace the target:
			int index;
			int targetIndex = -1; // if targetIndex stays -1 then the target is not in the array.
			for (index = 0; index < length; index ++) {
				if (integers[index] == target) {
					targetIndex = index;
					integers[targetIndex] = targetReplacement;
				}
			}
			
			if (targetIndex == -1) {
				System.out.println("Sorry, that number was not in the array.");
			}
			else {
				// Read the user the new array:
				System.out.println("\nThe new array is: " + Arrays.toString(integers));
			}
			
			// Ask the user if they would like to replace any more items:
			Thread.sleep(1000);
			System.out.print("\n\nWould you like to replace any more numbers? Type yes or no: ");
			replace = userinput.nextLine();
			replace = replace.toLowerCase();
		}
			
		// Tell the user the program will now sort the array:
		Thread.sleep(1000);
		System.out.println("\nThe program will now sort the numbers in your array from lowest to highest:");
		
		// Sort the array and print it: 
		Thread.sleep(2000);
		Arrays.sort(integers);
		System.out.println(Arrays.toString(integers));
		
		// Tell the user the program has ended:
		Thread.sleep(1000);
		System.out.println("\nThe program has ended.");
		
		
		
		
		

	}

}

