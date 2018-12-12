/*
Author: Cael Legas
Date: 9/11/2018
7-15
*/

import java.util.Scanner;

class Exercise7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int numberOfDisticctValues = 0;
		System.out.print("enter 10 numders with spaeces in between: "); 
		
		for (int i = 0; i < numbers.length; i++){
			int value = input.nextInt();
			
			boolean isinthearray = false;
			for (int j = 0; j < numberOfDisticctValues; j++){
				if (value == numbers[j]){
					isinthearray = true;
				}
			}
			if (!isinthearray){
				numbers[numberOfDisticctValues] = value;
				numberOfDisticctValues++;
			}
		}
		System.out.println("the numder of destinkt valuse is: " + numberOfDisticctValues);
		System.out.print("List whithout duplicates: ");
		for (int i = 0; i < numberOfDisticctValues; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}