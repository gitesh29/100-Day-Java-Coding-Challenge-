

import java.util.Scanner;

public class Day_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Emnter a number =");
		int n1=sc.nextInt();
		int reverse=0;
		while (n1!=0) {
			int digit = n1 % 10;
			reverse=reverse*10+digit;
			n1/=10;
		}
		System.out.println("reverse "+reverse);
	}
	

}
