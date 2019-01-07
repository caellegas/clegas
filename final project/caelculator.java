/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;
import javax.sound.midi.*;

class caelculator {
	public static void main(String[] args) {
		System.out.println("Enter a number: 1 = foil, 2 = Quadratic formula, 3 = meaning of life the universe and everything, 4 = volume of a sphere, 5 = add two matrexses, 6 = subtract two matrexses, 7 = common denominators.");
		
		Scanner input = new Scanner(System.in);
		int name = input.nextInt();
		int foil = 1;
		
		if (name == foil) {
			
			System.out.println("foel methid: (ax + b)(cx + d)");
			System.out.println("enter a");
			double f1 = input.nextInt();
			System.out.println("enter b");
			double f2 = input.nextInt();
			System.out.println("enter c");
			double f3 = input.nextInt();
			System.out.println("enter d");
			double f4 = input.nextInt();
			
			double f5 = f1 * f3;
			double f6 = f1 * f4;
			
			double f7 = f2 * f3;
			double f8 = f2 * f4;
			
			double f9 = f6 + f7; 
			
			System.out.println(f5 + "x^2 + " + f9 + "x + " + f8);

		}
		
		if (name == 2) {			
			System.out.println("Quadratic formula: ax^2 + bx + c ");
			System.out.println("enter a");
			double qa = input.nextInt();
			System.out.println("enter b");
			double qb = input.nextInt();
			System.out.println("enter c");
			double qc = input.nextInt();
					
			double q1 = (qb * qb) - (4 * qa * qc);
			if (q1 < 0) {
				System.out.println("no real solutin");
			}
			else {
				double q2 = Math.sqrt(q1);
			
				double q3 = ((qb * -1) + q2) / (2 * qa);
				double q4 = ((qb * -1) - q2) / (2 * qa);
			
				System.out.println("(" + q3 + "," + q4 + ")");  
			}
		}
		if (name == 3) {
			System.out.println("meaning of life the universe and everything: ");
			System.out.println("42");
		}
		
		if (name == 4) {
			System.out.println("volume of a sphere: V=3/4*3.14*r^3  ");
			System.out.println("enter r");
			double va = input.nextInt();
			double pi = 3.14159;
			double v1 = va * va * va; 
			double v2 = 4 / 3;
			
			double vv = v2 * pi * v1;
			
			System.out.println(vv);

		}
		
		if (name == 5) {
			int[][] matrix1 = new int[3][3];
			int[][] matrix2 = new int[3][3];
			
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					System.out.println("enter a number for matrix1:");
					matrix1[i][j] = input.nextInt();
				}
				System.out.println();
			}
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					System.out.println("enter a number for matrix2:");
					matrix2[i][j] = input.nextInt();
				}
				System.out.println();
			}

			for (int i = 0; i <matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					System.out.print(" " + (matrix1[i][j] + matrix2[i][j]));
				}
				System.out.println();
			}
		}
		if (name == 6) {
			int[][] matrix1 = new int[3][3];
			int[][] matrix2 = new int[3][3];
			
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					System.out.println("enter a number for matrix1:");
					matrix1[i][j] = input.nextInt();
				}
				System.out.println();
			}
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					System.out.println("enter a number for matrix2:");
					matrix2[i][j] = input.nextInt();
				}
				System.out.println();
			}

			for (int i = 0; i <matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					System.out.print(" " + (matrix1[i][j] * matrix2[i][j]));
				}
				System.out.println();
			}
		}
		if (name == 7) {
			System.out.println("Type in two numbers and I will print outs all the Common Divisor: ");
			int v1 = input.nextInt();
			int v2 = input.nextInt();
		
		
			for (int i = v2; i >= 1; i--) {
		
				if (v1 % i==0 && v2 % i ==0){
					System.out.print(i + ", ");
				}
			}
		}
	}
}