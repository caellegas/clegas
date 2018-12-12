/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;

class Excercise8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int N = 3;
		final int M = 3;  
		
		System.out.println("enter matrix1: ");
		double[][] matrix1 = new double[N][M];
		
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				matrix1[row][col] = input.nextDouble();
			}
		}
		
		System.out.println("enter matrix2: ");
		double[][] matrix2 = new double[N][M];
		
		for (int row = 0; row < matrix2.length; row++) {
			for (int col = 0; col < matrix2[row].length; col++) {
				matrix2[row][col] = input.nextDouble();
			}
		}
		// now add together 
		double[][] resultmatrix = addMatrix(matrix1, matrix2);
		System.out.println("the sum of the matrices is ");
		printResult(resultmatrix);
	}
	public static double[][] addMatrix(double[][] m1, double[][] m2){
		double[][] result = new double[m1.length][m1[0].length];
		for (int row = 0; row < result.length; row++) {
			for (int col = 0; col < result[row].length; col++) {
				result[row][col] = m1[row][col] + m2[row][col];
			}
		}
		return result;
	}
	public static void printResult(double[][] m1){
		for (int row = 0; row < m1.length; row++) {
			for (int col = 0; col < m1[row].length; col++) {
				System.out.print(m1[row][col] + " ");
			}
			System.out.println();
		}
	}
}