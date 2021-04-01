package javaTest;

import java.util.Scanner; // require our imports
import java.util.Random;

public class BasicJavaPartThree {

	public static void main(String[] args) {
		
		//Declare our util Objects
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		/*
		 * Last time we used scanner.nextLine() to recieve any input from the user. We then had to test 
		 * if that input was a number. Java has a built in method for the scanner that makes this easier.
		 */
		
		int generatedRandom = random.nextInt(11); //Due to a thing called SCOPE we must declare the variables outside of the loops in order to utilize them later on.
		int guess = 0; //A declared variables scope exists only within the first set of brackets it is nested in and any of its "child" brackets.
		
		/*
		 * Using a  do/while loop allows us to set code to run while a condition is not true.
		 * While similar to a standard while loop, a do/while loop offers you slightly more
		 * constrol and readability.
		 */
		do {
			System.out.println("Please enter a number between 1 & 10");
			guess = scanner.nextInt(); //Instead of using nextLine() to accept a string from the console, we can specifically target an integer
		}
		while(guess != generatedRandom);
		
		//Since that loop will only break 
		System.out.println("Correct! The number was " + generatedRandom);
	}
}
