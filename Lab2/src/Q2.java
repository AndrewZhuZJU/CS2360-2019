//////////////////////////////////////////////////////////////
// Q2 This program is for computing the volume of cylinder with user input
// Author: Bin Zhu
// Date: 12/9/2019
//////////////////////////////////////////////////////////////

import java.lang.Math;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter radius of the cylinder
		System.out.println("Enter radius of the cylinder: ");
		double radius = input.nextDouble();
		//Enter length of the cylinder
		System.out.println("Enter length of the cylinder: ");
		double length = input.nextDouble();
		double area = 0.0;
		double volumn = 0.0;
		
		// compute the formula
		//System.out.println(Math.PI);
		area = radius*radius*Math.PI;
		volumn = area*length;
		
		// print out the answer
		System.out.printf("The volumn pf the Cylinder is %.4f", volumn);

	}

}
