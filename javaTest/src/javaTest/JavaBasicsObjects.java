package javaTest;

/*
 * Skip to class section below on line: before continuing on the main method
 */

public class JavaBasicsObjects {

	public static void main(String[] args) {
		
		//Now we can access the Person class to build a person
		//declare a new person
		Person me = new Person();
		
		//now we set their attributes
		me.name = "Justin Yates";
		me.hairColor = "Brown";
		me.age = 23;
		
		//now the person "me" has a name, hair color, and age, which was built by using the person class that is all stored under the variable "me"
		
		/*
		 * Now, why do we need a class to build a person?
		 * Well, we don't if its just one person. But thousands?
		 * For each person you would have to declare and initialize new variables for each data point you wish to record.
		 * personOneAge, personOneHairColor, etc.
		 * One of the most useful skills you can aquire as a developer is to not repeat code, and spot redundancies.
		 * Classes help us code less and makes our code more readable.
		 */
		
		Person you = new Person();
		
		you.name = "John Smith";
		you.hairColor = "Blonde";
		you.age = 30;
		//This way of building an object is not the best practice, but its the best way to visualize for now. Later, we will get into constructors.
		
		//Now that we have two people, we can access either of them from their variable
		System.out.println(me);
		System.out.println(you);
		//Now what the hell just printed to the console?
		// Java stores the objects in its own configuration. You will have to specify WHAT data you want to access
		System.out.println(me.name);
		System.out.println(you.age);
		
		//Now we can go back to the method defined in the Person Class
		me.speak(); 
		
		//What would happen if we were to just use speak() with a defined Person object?
		
		//We would get an error "speak is not defined". This is because the speak method is only accesiable withing a Person object, such as me or you.
	}

}

/*
 * A calss is a blueprint for creating objects.
 * Class names always start with uppercase letters
 * A public class, or a class that is accessible to the package (more on this later) must always
 * be named after the file it is in.
 * You are able to have multiple private classes in one file.
 */

/*
 * What is an object?
 * Everything in Java is an object. Classes represent the ideas for wehat you are trying to build.
 * Take for instance the class below:
 * This class is called Person. It will not define a SPECIFIC person, but rather it will hold
 * all of the building blocks that each and every person share, so that a unqiue person can then
 * be built by utilizing the blueprint.
 */

class Person {
	/*
	 * Classes can contain: 
	 * 1. Data
	 * 2. Subroutines, or things that the code will do (methods)
	 */
	
	//Data (instance variables, or "state"
	String name;
	String hairColor;
	int age;
	
	//Subroutines
	/*
	 * Subroutines, or methods, are kind of similar to conditonals. They execute code.
	 * The difference is, methods will only run when CALLED UPON, and can contain multiple conditionals. 
	 * Methods can also take in arguments within the parenthesis ().
	 * If you remember variable scope, how variables are only accessible in the brackets they are called upon (and any child brackets)
	 * arguments are a way to transfer those variables to a method so that method can then utilize thiose values in its processes.
	 * Arguments should only be passed to a method if that method relies on those values, and those values come from outside of the method.
	 */
	void speak() { //for now don't worry about the void and what it means
		//For this method, we are able to access the data of the Person
		System.out.println("Hello. I am " + name + " and I am " + age + " years old."); //note the spaces in the strings. Unless they are specified, spaces will not be in the declared values
	}
}
