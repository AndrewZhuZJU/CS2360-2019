//////////////////////////////////////////////////////////////
// Q1 This program is for computing the volume of cylinder
// Author: Bin Zhu
// Date: 12/9/2019
//////////////////////////////////////////////////////////////

import java.lang.Math;

public class Cylinder {

	public static void main(String[] args) {
		// declare the variables
		double radius = 5.0;
		double length = 30;
		double area = 0.0;
		double volumn = 0.0;
		
		// compute the formula
		System.out.println(Math.PI);
		area = radius*radius*Math.PI;
		volumn = area*length;
		
		// print out the answer
		System.out.printf("The volumn pf the Cylinder is %.4f", volumn);

	}

}
