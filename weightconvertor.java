package thesecondtrial;
import java.util.*;

public class weightconvertor {
	public static void main(String[] args) {
		// take input from user (kg or lbs?)
		// take input from user the weight to be converted
		// convert weight and print output
		
		// WEIGHT CONVERSION PROGRAM
		
		// Declare variables
		Scanner scanner = new Scanner(System.in);
		double lbs_to_kg = 0.45359237;
		int choice;
		double input_weight;
		
		// Welcome message
		
		System.out.println("Welcome to the Weight Conversion Program!");
		System.out.println("\nOption 1: From pounds (lbs) to kilograms (kgs)");
		System.out.println("\n\nOption 2: From kilograms (kgs) to pounds (lbs)");
		System.out.print("\nType 1 for Option 1 OR 2 for Option 2: ");
		
		
		// Prompt for user choice
		
		choice = scanner.nextInt();
		
		if(choice == 1) {
		// Option 1: lbs to kgs
			System.out.print("How many lbs do you wish to convert to kgs? ");
			input_weight = scanner.nextDouble();
			System.out.printf("%.2f lbs is equivalent to %.2f kgs",input_weight, input_weight*lbs_to_kg);
		}
		else if(choice == 2) {
		// Option 2: kgs to lbs
			System.out.print("How many kgs do you wish to convert to lbs? ");
			input_weight = scanner.nextDouble();
			System.out.printf("%.2f kgs is equivalent to %.2f lbs",input_weight, input_weight*Math.pow(lbs_to_kg, -1));
		
		}
		else {
		// else print not a valid choice
			System.out.println("Not a valid choice");
		}
					
		scanner.close();
		}
}
