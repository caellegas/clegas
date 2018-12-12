/*
Author: Cael Legas
Date: 9/11/2018
7-15
*/

import java.util.Scanner;
import javax.xml.transform.*;

class Exercise7_15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.print("enter 10 numders with spaeces in between: "); 
		
		for (int i = 0; i < 10; i++){
			numbers[i] = input.nextInt();
		}
		int[] result2 = eliminateDuplicates(numbers);
		
		System.out.println("the # of are: " + result2.length);
		for (int i = 0; i < result2.length; i++){
			System.out.print(result2[i] + " ");
		}
	}
	public static int[] eliminateDuplicates(int[] list){
		int[] ryan = new int[list.length];
		int size = 0;
		for (int i = 0; i < list.length; i++){
			boolean isintheArray = false;
			for (int j = 0; j < i && !isintheArray; j++) {
				if (list[j] == list[i]) {
					isintheArray = true;
				}
			} 
			if (!isintheArray) {
				ryan[size] = list[i];
				size++;
			}
		}
		
		int[] Result = new int[size];
		for(int i = 0; i < size; i++){
			Result[i] = ryan[i];
		}
		return Result;
	}
}