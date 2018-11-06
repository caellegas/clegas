/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter side 1 2 and 3: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		double perimeter = side1 + side2 + side3;
		
		if (side1 + side2 < side3){
			System.out.println(" input is invalid");
			
		
			if (side2 + side3 < side1){
				System.out.println(" input is invalid");			
			
				if (side3 + side1 < side2){
					System.out.println(" input is invalid");
		}		
			}		
				}
				else {
					System.out.println(perimete);
				}						
	}
}
												