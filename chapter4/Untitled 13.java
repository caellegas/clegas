/*
Author: Cael Legas
Date: 9/16/2018
*/

import java.util.Scanner;
import javax.sound.midi.*;

class Untitled {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter employee's name: ");
		String name = input.next();
		
		System.out.println("enter number of hours worked: ");
		double hours = input.nextDouble();
		
		System.out.println("enter hourly wrate: ");
		double payrate = input.nextDouble();
		
		System.out.println("enter fedreral tax whithholding rate:");
		double fedtax = input.nextDouble();
		
		System.out.println("enter state tax withholding rate: ");
		double statetax = input.nextDouble();
		
		double grosspay = hours * payrate;
		double fedtaxwithhold = grosspay * fedtax;
		double statetaxhold = grosspay * statetax;
		double totaldeductin = fedtaxwithhold + statetaxhold;
		double netpay = grosspay - totaldeductin;
		
		String out = "\nEmployee Name: " + name + "\n";
		out += "hours Worked: " + hours + "\n";
		out += "pay rate: " + payrate +  "\n";
		out += "gross pay: $" + grosspay + "\n";
		out += "deductions: \n"; 
		out += "   federal Witholding (" + fedtax * 100 + "%): $" + (int)(fedtaxwithhold * 100) / 100.0 + "\n";
		out += "   state Witholding (" + statetax * 100 + "%): $" + (int)(statetaxhold * 100) / 100.0 + "\n";
		out += "   total deduction: $" + totaldeductin + "\n";
		out += "net pay: " + netpay + "\n"; 

		System.out.print(out);
	}
}