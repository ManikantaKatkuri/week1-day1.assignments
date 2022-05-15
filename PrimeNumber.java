package week1.day1.assignments;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 */

	public static void main(String[] args) {

		int input =13;
		int flag=0;
		if (input== 0 || input== 1) {
			System.out.println("It's a Prime Number");
		} else {
			for (int i=2; i<input; i++) {
				if (input%i == 0)
				{
					System.out.println("Not a Prime Number");
					flag=1;
					break;
				}			
			}
			if (flag==0) {
				System.out.println("It's a Prime Number");
			}
		}	
	}
}