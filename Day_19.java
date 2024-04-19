
//WAP to Check Armstrong Number .

public class Day_19 {

	public static void main(String[] args) {
		int no = 371, rem, org, result = 0;
		org = no;

		while (org != 0) {
			rem = org % 10;
			result += Math.pow(rem, 3);
			org /= 10;
		}

		if (result == no)
			System.out.println(no + " is an Armstrong number.");
		else
			System.out.println(no + " is not an Armstrong number.");
	}

}
