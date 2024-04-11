
//WAP to Find LCM of two Numbers .

import java.util.Scanner;

public class Day_15 {

	public static void main(String[] args) 
	{
		int lcm;
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter a number =");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      
      lcm = (n1 > n2) ? n1 : n2;

      while(true) {
          if( lcm % n1 == 0 && lcm % n2 == 0 ) {
              System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
              break;
          }
          lcm++;
      }
	}

}
