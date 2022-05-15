package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 
	 * output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 */

	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1, sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i=1;i<=range;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
	}
}