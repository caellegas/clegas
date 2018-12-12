/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;
import javax.sound.midi.*;

class Exercise6_17{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter a n: ");
		int n = input.nextInt();
		
		printMatrix(n);
		
		
		
	}
	public static void printMatrix(int n){
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n; j++) {
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}