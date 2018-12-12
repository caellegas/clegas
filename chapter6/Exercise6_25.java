/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;

class Exercise6_25 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter a time in milliseconds: ");
		long totalmil = input.nextLong();
		
		System.out.println(convertMillis(totalmil));
	}
	public static String convertMillis(long millis){
		long totalamontSekinds = millis / 1000;
		
		int seconds = (int)(totalamontSekinds % 60);
		
		long totalminits = totalamontSekinds /60;
		
		int minits = (int) (totalminits % 60);
		
		long hours = totalminits / 60;
		
		return hours + ":" + minits + ":" + seconds;
		
	}
}