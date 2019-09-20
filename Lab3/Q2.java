// Distance of two points

import java.util.Scanner;
import java.lang.Math;

public class Q2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Enter the first point
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//Enter the second point
		System.out.println("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distance = 0.0;
		
		// compute the formula
		double a = Math.pow(x2-x1,2) + Math.pow(y2-y1, 2);
		distance = Math.pow(a, 0.5);
		System.out.println("The distance is:" + distance);

	}

}
