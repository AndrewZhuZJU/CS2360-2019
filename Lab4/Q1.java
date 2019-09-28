import java.util.Scanner;
import java.lang.Math;

public class Q1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			
		//Enter x, y, z
		System.out.println("Enter three real values: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		//Median in three values is sum minus max and min among them
		System.out.println("Median value is " + ((x+y+z)-Math.min(Math.min(x, y),z)-Math.max(Math.max(x, y),z)));

		//close input
		input.close();

	}

}
