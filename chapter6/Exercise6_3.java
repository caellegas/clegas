/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;
import javax.sound.midi.*;

class Exercise6_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter a positive number: ");
		int s = input.nextInt();
		
		int low = 0;
		
			
		if (isPalindrome(s)){
			
			System.out.println(s + " is a pal");
		}
		else {
			System.out.println(s + " is not a pal");
		}
	}
	public static boolean isPalindrome(int s){
		return s == reverse(s);
	}
	public static int reverse(int s){
		int low = 0;
		while (s != 0) {
			int reman = s % 10;
			low = low * 10 + reman;
			
			s = s /10;
			
		}
		return low;
	}
}