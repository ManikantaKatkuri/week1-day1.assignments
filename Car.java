package week1.day1.assignments;

public class Car {
	
	/*
	 * Goal: Create a Class and create methods for this class
	 * 
	 * What are my learnings from this code?
	 * 1) You have to create an Object in order to print variables inside a method
	 * 2) Object can be created by giving new() keyword
	 * 3) Program Execution starts from the main method
	 */	
	
	public void applyBreak() {
		System.out.println("Inside Apply Break method");
	}
	public void applyGear() {
		System.out.println("Inside Apply Gear method");
	}
	public void switchonAc() {
		System.out.println("Inside Switch on AC method");
	}
	public void applyAcclerate() {
		System.out.println("Inside Apply Accelerate method");
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchonAc();
		obj.applyAcclerate();
	}
}
