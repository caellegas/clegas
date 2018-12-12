/*
Author: Cael Legas
Date: 9/11/2018
*/

import java.util.Scanner;

class Exercise7_9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("enter 10 numders with spaeces in between");
		for (int i = 0; i < numbers.length; i++ ){
			numbers[i] = input.nextDouble();
		}
		
		System.out.println("the minimum value in the array is: " + min(numbers));
	}
	public static double min(double[]list){
		double mindouble = list[0];
		for (int i = 1; i < list.length; i++) {
			if (mindouble > list[i]){
				mindouble = list[i];
			}
		}
		return mindouble;
	} 
}