package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input a year");
		int year = in.nextInt();
		boolean byFour = (year%4) == 0;
		boolean byOneHundred = (year%100) != 0;
		boolean byFourHundred = (year%400) == 0;
		boolean LeapYear = byFour && byOneHundred || byFourHundred;
		System.out.println(LeapYear);

		// TODO Auto-generated method stub

	}

}
