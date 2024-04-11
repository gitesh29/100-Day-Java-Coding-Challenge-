
//WAP to Check Whether a Number is Even or Odd .

import java.util.Scanner;

public class Day_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter a number ");

		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("It ia a even number ");
		} else {
			System.out.println("It is a odd number ");
		}

	}

}
