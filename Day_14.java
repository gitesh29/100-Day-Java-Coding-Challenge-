import java.util.Scanner;

public class Day_14 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        System.out.println("Enter the Numbers -");
	        int n1 = input.nextInt();
	        int n2 = input.nextInt();
	        int gcd = 1;

	        for (int i = 1; i <= n1 && i <= n2; ++i) {

	            if (n1 % i == 0 && n2 % i == 0)
	                gcd = i;
	        }

	        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);

	}

}
