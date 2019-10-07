// Great circle distance

import java.util.Scanner;
import java.lang.Math;

public class Q2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Enter the first point
		System.out.println("Enter point 1 (lantitude and longitude): ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//Enter the second point
		System.out.println("Enter point 2 (lantitude and longitude): ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		input.close();
		
		// Degree to radian
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double RADIUS = 6371.01; 
		
		// compute the distance between two points
		double distance = RADIUS * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		System.out.printf("The area is: %.3f", distance);

	}

}
