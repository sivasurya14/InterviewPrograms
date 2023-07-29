package testReview;

import java.util.Scanner;

public class FindLeapYear {

	public static String isLeap(int year) {

		if (year % 4 == 0 && year % 400 != 0 || year % 400 == 0) {
			return year + " is leap Year ";
		} else
			return year + " is not a Leap year ";
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = scan.nextInt();
		FindLeapYear find = new FindLeapYear();
		System.out.println(find.isLeap(year));

	}
}
