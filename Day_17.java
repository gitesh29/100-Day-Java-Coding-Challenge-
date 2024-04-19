
//WAP to Check Palindrome .

import java.util.Scanner;

public class Day_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int r = 0;
		int x = num;
		while (num != 0) {
			int d = num % 10;
			r = r * 10 + d;
			num /= 10;

		}
		if (x == r) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
