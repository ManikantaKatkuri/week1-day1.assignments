package week1.day1.assignments;

public class TwoWheeler {
	
	/*
	 * Goal: Create a Class, Declare the Variables and Methods, 
	 * call all the variables inside main method and print the values.
	 * 
	 * What are my learnings from this code?
	 * 1) You have to create an Object in order to print variable inside a method
	 * 2) Object can be created by giving new() keyword
	 * 3) Program Execution starts from the main method
	 */	

	int noOfWheels= 2;
	short noOfMirrors= 2;
	long chassisNumber= 654789123456L;
	boolean isPunctured= false;
	String bikeName= "Royal Enfield Classic 350";
	double runningKM= 8546.97;
	
	public static void main(String[] args) {
		
	TwoWheeler obj=new TwoWheeler();
	System.out.println("No of Wheels = " +obj.noOfWheels);
	System.out.println("No of Mirros = "+obj.noOfMirrors);
	System.out.println("Chasis Number = "+obj.chassisNumber);
	System.out.println("Is Punctured = "+obj.isPunctured);
	System.out.println("Bike Name = "+obj.bikeName);
	System.out.println("Running KM = "+obj.runningKM);
	
	}

}
