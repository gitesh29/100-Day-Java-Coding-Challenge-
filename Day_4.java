
//WAP to find largest and smallest no.,out of 3 "without using if...else" .
public class Day_4 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;

		int d = Math.min(a, Math.min(b, c));

		System.out.println("Smallest numebr =" + d);
	}

}
