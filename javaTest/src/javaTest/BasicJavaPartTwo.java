package javaTest;

import java.util.Scanner; //This is the package you need to import to utilize the user input functionality shown below
import java.util.Random;

public class BasicJavaPartTwo {

	public static void main(String[] args) {
		
		/*
		 * This next example is going to combine a few of the concepts we have reviewed already
		 * into a small, semi-functional program. 
		 * There will be some new concepts introduced, such as the Scanner object, the Rnadom object,
		 * and try/catch statements.
		 * The program will ask the user to guess a number between one and ten.
		 */
		
		//create a new Scanner object to accept user input through the console
		Scanner input = new Scanner(System.in); //Scanners are set to variables. The sytax is the same for most commonly used scanners
		
		//Prompt the user for input
		System.out.println("Please guess a number from 1-10");
		
		//Set their response to a variable.
		String response = input.nextLine(); //This will take the next line of input from a user
		
		//We then close the input
		input.close();
		
		//Now lets do something with that value we got
		int responseInt = 0;
		
		/*
		 * A try/catch statement will attempt to run the code inside of the try block. If it fails, it will handle
		 * what is called an EXCEPTION, or an error in the catch block. This is a more advanced way of handling
		 * code that is not going to work for certain, like code that requires user input. When you define the catch block
		 * you can regain some control of how to handle these exceptions so that it doesnt break your program. An optional feature 
		 * of try/catch blocks is the finally block. This allows you to run a certain  code no matter what happens with the first two blocks.
		 */
		
		try {
			responseInt = Integer.parseInt(response); //We are going to try to set the user response STRING to an INTEGER.
		} catch(Exception e) {
			System.out.println("The valued entered could not be converted into a number!"); //If the user entered letters, it cant be converted to an integer, so we let them know this.
		} //the finally block would go here, but we don't nbeed it for this program.
		
		//Now, we can use the utility package RANDOM to generate a random number
		Random random = new Random(); //Similar syntax to the scanner object
		
		//We can set a variable to the random number generated, specifying in the arguments (the stuff in the parenthesis) what our "upper bound" is. this will telll it to generate a number between 1 and 10
		int randomInt = random.nextInt(11);
		
		//Now, we will use an if/else statement to see if the numbers match.
		if(responseInt != randomInt) {
			System.out.println("Incorrect, please guess again!");
		} else {
			System.out.println("Correct!");
		}
		
		/*
		 * It should be noted that this program will end before you've guessed the correct number.
		 * That will be handled down the line when we go over functions by nesting a function withing a conditional.
		 */

	}
}
