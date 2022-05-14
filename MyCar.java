package week1.day1.assignments;

public class MyCar {

	/*
	 * Goal: Create a MyCar class and create object for existing(car) class and call the methods of car class
	 * 
	 * * What are my learnings from this code?
	 * 1) if access modifier is declared as public then you can call the methods present anywhere in the 
	 * project folder(under any package/Class in to the current class
	 * 2) You have to create an Object in order to print variable inside a method
	 * 3) Object can be created by giving new() keyword
	 */	
	
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchonAc();
		myCar.applyAcclerate();

	}

}
