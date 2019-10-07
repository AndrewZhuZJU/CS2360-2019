// Area of triangle

import java.util.Scanner;
import java.lang.Math;

public class Q1 {

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
		
		//Enter the third point
		System.out.println("Enter x3 and y3: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();
		
		// compute the distance between two points
		double a = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
		double b = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1, 2));
		double c = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2, 2));
		
		// calculate the area
		double s = (a + b + c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.printf("The area is: %.3f", area);

	}

}
