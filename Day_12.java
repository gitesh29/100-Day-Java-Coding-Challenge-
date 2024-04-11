
//WAP to Generate Multiplication Table .

import java.util.Scanner;

public class Day_12 {

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner (System.in);
     System.out.println("Entr a number ");
     int num=sc.nextInt();
     for (int i = 1; i <=10; i++) {
		System.out.printf("%d * %d=%d /n",num , i, num*i);
	}
	}

}
