/*
Author: Cael Legas
Date: 9/11/2018
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the length from the center of a pentagon to a vertex: ");
		double r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		System.out.println("");
		double area = 5 * side * side / Math.tan(Math.PI / 5) / 4;
		System.out.println("the area is " + area);
	}
}
