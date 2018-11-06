/*
Author: Cael Legas
Date: 9/11/2018
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a year: ");
		int year = input.nextInt();
		
		int Jan = 31;
		int Feb = 28;
		int Mar = 31;
		int Apr = 30;
		int May = 31;
		int Jun = 30;
		int Jul = 31;
		int Aug = 31;
		int Sep = 30;
		int Oct = 31;
		int Nov = 30;
		int Dec = 31;
		
		System.out.println("enter a first 3 leters of a month: ");
		String month = input.next();
		
		if ((month.equals("Jan")) || (month.equals("Mar")) || (month.equals("May")) || (month.equals("Jul")) || (month.equals("Aug")) || (month.equals("Oct")) || (month.equals("Dec"))) {
			System.out.println(month + " " + year +" has 31 days");
		}
		if ((month.equals("Apr")) || (month.equals("Jun")) || (month.equals("Sep")) || (month.equals("Nov"))) {
			System.out.println(month + " " + year +" has 30 days");
		}
		else if ((month.equals("Feb")) && (year % 4 == 0 )){
			System.out.println(month + " " + year +" has 29 days");
		 }
		else if ((month.equals("Feb")) && (year % 4 != 0 )) {
			System.out.println(month + " " + year +" has 28 days");
		}
		else {
			System.out.println("invalid month ");
		}
	}
}