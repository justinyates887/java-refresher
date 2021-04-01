package javaTest;

public class BasicJavaArrays {

	public static void main(String[] args) {
		
		/*
		 * An array is a form of basic data storage. It is a culmination of a list of items held within one variable.
		 * Decalring an array variable is different than declaring a primitive. When you declare a primitive variable
		 * you are declaring a VALUE. In an array, you are declaring a reference. 
		 */
		
		//We declare the array
		int[] values;
		
		//Now, we use the refence to allocate a new memory cap for the integer array large enough to hold 3 integers, or int[3]
		values = new int[3];
		
		/*
		 * When working with and accessing data in an array, you will encounter the "off-by-one" problem.
		 * Say you wanted to access the first datapoint in an array:
		 * To do this you need to specify which array and put square brackets, so values[]
		 * In the brackets, you say at which point in the list you would like to access.
		 * The problem is, arrays don't start at 1, but instead they start at 0.
		 * SO
		 * To access the first point of data in an array, you would need to use values[0]
		 * To access the second point of data you would use values[1] and so on
		 */
		
		//Knowing this, we can now initialize the values
		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		
		//So what happens if we try to declare values[3]?
		values[3] = 4;
		
		/* We get this error in the console: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		* This is because we set the max limit of the array o hold 3 values, which means the array can only go up to index[2]
		* NOTE: The index is the point of the array the data is stored at. In values[0], 0 is the index.
		*/
		
		/*
		 * Arrays are useful for storing like data inside of one accesible variable. 
		 * In future programs, we will be iterating through an arrays data.
		 * An easy way to do that is with a for loop.
		 */
		for(int i = 0; i < values.length; i++) {
			/*
			 * This loop will set the incriment i equal to 0, the first index of an array
			 * and incriment it up until it reaches the end of the array.
			 * But, how do we know how long an array is?
			 * In the beginning its easy, you've specified the memory cap and set the data yourself.
			 * This is called "Hradcoding"
			 * In future programs, your data will rely on factors you no longer have control of,
			 * so you won't know exactly how much data is in an array. To get around this, we can use
			 * the .length method. This will take the total size of the array, starting at 1.
			 * Using this, we can properly iterate through the array wihtout having to code its total length by hand.
			 */
			System.out.println(values[i]); //Since i is set to 0, the first index of any array, and we are incrimenting by 1, we can use i to reference the index in each iteration.
		}
		
		//You can also initialize the array at the time of declaration by using curly brackets to set the values
		int[] newValues = {1, 2, 3};
		
		//And we can iterate through the same way as before
		for(int i = 0; i < newValues.length; i++) {
			System.out.println(values[i]);
		}
		
		//Arrays can be consisted of any variable type, even strings
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "World";
		words[2] = "!";
		
		//or
		
		String[] fruits = {"banana", "apple", "pear", "kiwi", "mango"};
		
		//string arrays don't have to be one word
		
		String[] greetings = {"What's poppin?", "What's brackin?", "Hello there"};
		
		/*
		 * There is another for loop you can use to specifically use to iterate through arrays and objects (objects will be later on)
		 * Instead of using the traditional i = 0, you can set a variable for the index and loop through its parent array
		 */
		
		for(String fruit: fruits) { //This reads as: For String fruit in fruits...{do this}
			System.out.println(fruit); //This will print each "fruit" or index from 0 to fruits.length - 1 (the end of the array)
			//NOTE: fruits.length - 1 ??? The last index of an array will always be the length minus 1, as length begins counting at 1, whereas indexes start at 0
		}
		
		/*
		 * Arrays can be complex.
		 * Multi-dimensional arrays allow you to nest arrays within each other.
		 * Utilizing multi-dimensional arrays requires some knowladge of data structures and some planning
		 * Think of multi-dimesnsional arrays as an array of arrays
		 */
		
		int[][] grid = {
			{1, 2, 3},
			{10, 20, 30},
			{100, 200, 300, 400} //The nested array lengths do not need to be the same
		};
		
		//when you acces the first index of the array you will get {1, 2, 3}
		System.out.println(grid[0]);
		
		//you can accuess indexes withing the nested arrays by...
		System.out.println(grid[0][2]); //will print 3 to the console
		System.out.println(grid[1][0]); //will print 10 to the console
		
		//The same can be done with strings. In the next example we will be setting boundries for the array
		String[][] text = new String[2][3]; //this is saying that the array will have two indexes, and each of those indexes will have three nested indexes
		
		text[0][0] = "Hello";
		text[0][1] = "World";
		text[0][2] = "!";
		//now grid[0] reads as  {"Hello", "World", "!"}
		
		/*
		 * So how do you iterate through nested arrays?
		 * With a nested for loop ;)
		 */
		
		for(int i = 0; i < grid.length; i++) { //this demonstrates the two different ways of using the for loops
			for(int number: grid[i]) { //note how we can access i. The nested loop will break once all elements have been iterated, thus incrementing the parent loop
				System.out.println(number);
			}
		}
		
		
	}

}
