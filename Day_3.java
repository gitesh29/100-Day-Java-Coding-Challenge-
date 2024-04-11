
//WAP to find sum of 3 numbers and print the largest number .

import java.util.Iterator;

public class Day_3 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;

		int d = a + b + c;

		System.out.println("Sum =" + d);

		if (a > b && a > c) {
			System.out.println("Largest number =" + a);
		} else if (b > a && b > c) {
			System.out.println("Largest number =" + b);
		} else {
			System.out.println("Largest number =" + c);
		}

	}

}
