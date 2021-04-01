package javaTest;

/*
 * In this example we will be using the same class structure as before for Person
 * We will learn how to return data from an method so that we may use the result in another.
 * Please start in the Person Class
 */

public class JavaBasicsGetAndReturn {
	public static void main(String[] args) {
		//Now that we have our function, lets create some people.
		
		Person me = new Person();
		me.name = "justin yates";
		me.age = 23;
		
		Person you = new Person();
		you.name = "john doe";
		you.age = 30;
		
		/*
		 * now we can demonstrate the usefulness of return statments.
		 * Lets set some variables to the retirement function we have in the Person object
		 */
		
		int myYearsLeft = me.yearsToRetirement();
		int youYearsLeft = you.yearsToRetirement();
		
		//now we can see those results, and if need be use those variables in the main method
		System.out.println(myYearsLeft);
		System.out.println(youYearsLeft);
		
		//And we can use these variables to model the behavior of this method
		if(myYearsLeft > youYearsLeft) {
			int diff = myYearsLeft - youYearsLeft;
			System.out.println("I have " + diff + " more years to retirement than you!");
		} else {
			int diff = youYearsLeft - myYearsLeft;
			System.out.println("You have " + diff + " more years to retirement than me!");
		}
		
		/*
		 * Now, what about getting the values for a person?
		 * You could just do person.age, but its bad ppractice. 
		 * Typically that syntax is used for setting values without a constructor, or changing values. 
		 * This is where get methods come in.
		 * Return to the getAge() method in the Person class 
		 */
		
		//now, to get the age, we can use the get method
		int myAge = me.getAge();
		String myName = me.getName();
	}
}

class Person { //this will get an error since person is already defined within the package
	String name;
	int age;
	
	/*
	 * When you declare a method with "void" it means that it will not return any value.
	 * Simple put, the method will run, and that's it.
	 * But what if we want a method to give us something we can use in a different method?
	 * This will help us keep that clean code
	 */
	
	void speak() {
		System.out.println("My name is " + name);
	}
	
	int yearsToRetirement() { //when we declare int, we are specifying that we want this method to return an integer
		int yearsLeft = 65 - age;
		System.out.println("Years to retirement: 0" + yearsLeft);
		return yearsLeft; //now, when this method is run, it will run this method and return the value, which can then be set to a variable in a different method.
	}
	//Return to the main method
	
	//Now, we can write methods to return an instance variable so we don't have to use person.age
	int getAge() {
		return age; //this is a simple method that just returns the value you wish to retrive
	}
	
	String getName() {
		return name;
	}
	//return to main
}

