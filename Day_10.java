import java.util.Scanner;

public class Day_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		double num = sc.nextDouble();
		if (num > 0.0) {
			System.out.println("Number is positive ");
		} else if (num == 0.0) {
			System.out.println("Number is Zero");
		} else {
			System.out.println("Number is negative");
		}
	}
}
