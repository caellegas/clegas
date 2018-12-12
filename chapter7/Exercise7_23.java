/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;

class Exercise7_23 {
	public static void main(String[] args) {
		boolean lockers[] = new boolean[100];
		for (int i = 0; i <= 99; i++) {
			lockers[i] = false;
		}
		
		for (int s = 1; s <= 100; s++) {
			
			for (int l =  s - 1; l < 100; l += s) {
				lockers[l] = !lockers[l];
			}
		}
		System.out.print("these lokers are open: ");
		for (int i = 0; i <= 99; i++) {
			if (lockers[i]) {
				System.out.print((i + 1) + ", ");
			}
		}
	}
}