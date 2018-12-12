/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;

class Exercise6_37 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter a integer: ");
		int number = input.nextInt();
		System.out.print("enter a width: ");
		int width = input.nextInt();
		
		System.out.println("the formatted number is " + format(number, width));
	}
	public static String format(int number, int width){
		String result = number + "";
		
		for (int i = 0; i < width - len(number); i++){
			result ="0" + result;
		}
		return result;
	}
	public  static int len(int number){
		int size = 0;
		while (number > 0) {
			size += 1;
			number = number / 10;
			
		}
		return size;
		
	}
}