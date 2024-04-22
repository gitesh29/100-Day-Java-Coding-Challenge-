
//WAP to Remove All Whitespaces from a String .

public class Day_26 {

	public static void main(String[] args) {
		String s1 = "T    his is b  ett     er.";
		System.out.println("This is Origninal sentence= :" + s1);

		s1 = s1.replaceAll("\\s", "");
		System.out.println("Remove Whitespaces= " + s1);

	}

}
