package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for n1?");
		int n1 = in.nextInt();
		System.out.println("Value for n2?");
		int n2 = in.nextInt();
		double average = (n1 + n2)/2.0;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average);
		// TODO Auto-generated method stub

	}

}
