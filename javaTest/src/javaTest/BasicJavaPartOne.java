//I will be reviewing all code in one file. Once I reach concepts that are new to me I will begin pushing new files.

package javaTest;

public class BasicJavaPartOne {

	public static void main(String[] args) {
		//Standard hello world. System.out.print() or System.out.println() are the two main methods of outputting text to the console.
		System.out.println("Hello World");
		
		int myNumber = 12; //declaring variables in Java requires the type
		short myShort = 8888; //shorts hold up to 32bit
		long myLong = 888888888; //longs store up to 64bit
		boolean myBoolean = true; 
		char myChar = 'c'; //unicode characters are denoted with single quotes. Single and double quotes ARE NOT INTERCHANGABLE as they are in JS.
		
		/*
		 * Variables can be declared and initialized in one line, or declared and initialized later such as below
		 */
		
		double pi; //Declaration
		pi = 3.1415926535; // Initialization 
		
		float myFloat = 35.26f; //Doubles and floats are both used for decimal values. Float are the short version of doubles. They need to be specified with an f on the end.
		
		byte myByte = 127; //holds up to 8 bits of data. Useful for declaring arrays of data in where you know exactly how much space it will take up.
		
		/*
		 * Uppercase variable types are derived from Object classes and not primitive types
		 */
		
		String myString = "Hello World!"; //Strings are one of the most commonly used Object Class types, containing text between double quotes.
		
		/*
		 * String is the Object Class
		 * myString is the variable name / declaration
		 * the text object is what the variable is initialized with, in this case "Hello World!"
		 */
		
		String concatOne = "Hello";
		String concatTwo = "World";
		
		/*
		 * You can join strings together using a process called concatinating. This is done with the operator + in either a sysout or a new variable declarion as shown below.
		 */
		
		System.out.println(concatOne + concatTwo + "!");
		// or
		String greeting = concatOne + concatTwo + "!";
		System.out.println(greeting);
		
		/*
		 * You can concat a string with other variable typoes as well.
		 */
		
		System.out.println("My number is " + myNumber);
		
		/*
		 * You can also user sysout formatter, which takes arguments instead of concats.
		 * 
		 * The first argument in the parenthesis is the format specifier, or what type you want the output to be. 
		 * Note that it will autodetect, so you don't have to say String if you want a String. Instead you can use "A real string"
		 * 
		 * The second+ argument is a value to fill
		 */
		
		System.out.printf("Pi is equal to : %d", pi); //%d specifies 
		
		/*
		 * boolean types do not have to be set directly to true or false. You can put expressions inside the initalization which will output a boolean value.
		 */
		
		boolean isTrue = 10 > 5; // outputs true
		boolean isFalse = 10 < 5; //outputs false
		
		
		/*
		 * Loops are an important part of any program. It allows you to run code under certain conditions.
		 * The next example is a while loop in Java. This code will run while a certain condition is or is not met.
		 */
		
		int value = 0;
		while(value < 10) {//WHILE this condition is TRUE,
			 //Do this
			System.out.println("True? : " + myBoolean);

			/*
			 * If you do not set a limit on your condition it will never resolve.
			 * This means that the loop will run forever, putting a great strain on your system and codebase.
			 * It is important to always have failsafes on your loops to ensure no infinite loop occurs, be it an incrimintor or a timeout
			 */
			
			value++; //Using a ++ on an Number type will increment the variable by 1, same as doing value = value + 1. This concept applies for subtraction as well (value--)
		};
		
		/*
		 * Do/while loops
		 */
		
		/*
		 * Another type of loop is a FOR loop. It operated much like a while loop, but is a little shorter to write.
		 */
		
		for(int i = 0; i < 10; i++) {
			
			/*
			 * You can see we used a similar structure and functionality to the while loop, but did it in one line.
			 */
			System.out.println(i); //This will count from 0 to 9
			
			/*
			 * There is no need to incriment, as it as been done in the loop parameters.
			 */
		};
		
		/*
		 * While and for loops are both classified as conditional loops.
		 * Another condition type is the if, else if, and else conditional STATEMENTS.
		 * Conditionals can be nested.
		 */
		
		int anotherInt = 10;
		boolean anotherBool = true;
		
		if(anotherInt == 10 && anotherBool == true) { //note the two equal signs(==). This is how you check for equality, whereas one equal(=) sets a value
			System.out.println("True | true");
		} else if(anotherInt == 10 && anotherBool == false) { // && is the equivilent of saying AND, whereas || means OR. && means both need to be true, wheres || means either needs to be true
			System.out.println("True | False");
		} else if(anotherInt != 10 && anotherBool == true) { // != means does not equal
			System.out.println("False | true");
		} else {
			System.out.println("False | false");
		}
		
		/*
		 * Another way to execute long if/else statements is by using a switch. This takes in a value as an argument and checks it against different CASES.
		 * If a case is met, it will execute that case.
		 */
		
		switch(anotherInt) {
		case 0:
			System.out.println("0");
			break; //a break statement is needed to stop the switch from executing, otherwise the switch will keep running
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("anotherInt is not between 0 and 2"); //A defualt is the action that occurs when no case has been satisfied
			break;
		}
	}
}

