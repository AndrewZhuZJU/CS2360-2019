// Estimate area

import java.util.Scanner;
import java.lang.Math;

public class Q3 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Enter the first point
		System.out.println("Enter Atlanta (lantitude and longitude): ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//Enter the second point
		System.out.println("Enter Charotte (lantitude and longitude): ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//Enter the third point
		System.out.println("Enter Savannah (lantitude and longitude): ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//Enter the fourth point
		System.out.println("Enter Orlando (lantitude and longitude): ");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		input.close();
		
		// Degree to radian
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		x3 = Math.toRadians(x3);
		y3 = Math.toRadians(y3);
		x4 = Math.toRadians(x4);
		y4 = Math.toRadians(y4);

		double RADIUS = 6371.01; 
		
		// compute the distance between two cities
		// distance between Atlanta and Charotte
		double distance_AC = RADIUS * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		// distance between Charotte and Savannah
		double distance_CS = RADIUS * Math.acos(Math.sin(x2)*Math.sin(x3) + Math.cos(x2)*Math.cos(x3)*Math.cos(y2-y3));
		// distance between Atlanta and Savannah
	    double distance_AS = RADIUS * Math.acos(Math.sin(x1)*Math.sin(x3) + Math.cos(x1)*Math.cos(x3)*Math.cos(y1-y3));
	    // distance between Savannah and Orlando
	    double distance_SO = RADIUS * Math.acos(Math.sin(x3)*Math.sin(x4) + Math.cos(x3)*Math.cos(x4)*Math.cos(y3-y4));
	    // distance between Orlando and Atlanta
	    double distance_OA = RADIUS * Math.acos(Math.sin(x4)*Math.sin(x1) + Math.cos(x4)*Math.cos(x1)*Math.cos(y4-y1));
		
	    
	    // calculate the area
	    double s_ACS = (distance_AC + distance_CS + distance_AS)/2;
	    double s_ASO = (distance_AS + distance_SO + distance_OA)/2;
	    double area_ACS = Math.sqrt(s_ACS*(s_ACS-distance_AC)*(s_ACS-distance_CS)*(s_ACS-distance_AS));
	    double area_ASO = Math.sqrt(s_ASO*(s_ASO-distance_AS)*(s_ASO-distance_SO)*(s_ASO-distance_OA));
	    double estimate_area = area_ACS + area_ASO;
	    System.out.printf("distance_AC:%.3f, distance_CS:%.3f, distance_AS:%.3f\n", distance_AC, distance_CS, distance_AS);
	    //The number should be around 117,863.34
	    System.out.printf("The estimated area is: %.3f", estimate_area);
	 
	}

}
