package studio1;

import support.cse131.ArgsProcessor;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int year = ap.nextInt("What is the year?");
		boolean isLeap = ((year % 4 == 0) && (year % 100 != 0)||(year % 400 == 0));
		System.out.println("Is it a leap year? " + isLeap + ".");
	}

}
