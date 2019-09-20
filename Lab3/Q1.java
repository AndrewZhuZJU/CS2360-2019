//Calculating energy 
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		//Enter the amount of water in kilograms
		System.out.println("Enter the amount of water in kilograms: ");
		double water_weight = input.nextDouble();
		
		//Enter the initial temperature
		System.out.println("Enter the initial temperature: ");
		double initial_T = input.nextDouble();
		
		//Enter the final temperature
		System.out.println("Enter the final temperature: ");
		double final_T = input.nextDouble();
		//close input
		input.close();
		
		double energy = 0.0;
		
		// compute the formula
		energy = water_weight*(final_T - initial_T)*4184;
		System.out.println("The energy needed is:" + energy);

	}

}
