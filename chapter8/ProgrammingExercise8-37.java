/*
Author: Jacob Almeida
Date: 11-20-2018
*/
import java.util.Scanner;

class ProgrammingExercise8_37 {
	public static void main(String[] args) {
		
		String[][] stateCapitals = {
			{"Arizona", "Phoenix"},
			{"North Dakota", "Bismark"},
			{"California", "Sacramento"},
			{"Arkansas", "Little Rock"},
			{"Maine", "Augusta"},
			{"Maryland", "Annapolis"},
			{"Tennessee", "Nashville"},
			{"Michigan", "Lansing"},
			{"New York", "Albany"},
			{"Utah", "Salt Lake City"}
		};
		
		Scanner input = new Scanner(System.in);
		int doBcorrect = 0;
		
		for (int i = 0; i < stateCapitals.length; i++) {
			System.out.println("What is the capital of " + stateCapitals[i][0] + "?");
			String n = input.nextLine();
			if (n.equalsIgnoreCase(stateCapitals[i][1])) {
				System.out.println("Your answer do B correct!");
				doBcorrect++;
			}
			else {
				System.out.println("Your answer do B incorrect, the correct answer is " + stateCapitals[i][1]);
			}
		}
			System.out.println("Your correct count is: " + doBcorrect + "/10");
	}
}