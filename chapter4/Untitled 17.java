/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the x and the y value ");
		
		double xvalue = input.nextDouble();
		double yvalue = input.nextDouble();
		
		if (Math.abs(xvalue) <= 5 && Math.abs(yvalue) < 2.5){
			System.out.println("point (" + xvalue + "," + yvalue + ") is in the rectangle " );
			
		}
		else {
			System.out.println("point (" + xvalue + "," + yvalue + ") is not in the rectangle ");
		}
	}
}