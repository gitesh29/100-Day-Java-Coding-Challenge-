
//WAP to Display Factors of a Number .

public class Day_20 {

	public static void main(String[] args) {
		int number = 60;
		System.out.println("Factor of " + number + " are :");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i + " ");
			}
		}
	}

}
