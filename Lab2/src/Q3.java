//////////////////////////////////////////////////////////////
// Q2 This program is for computing the volume of cylinder with user input from dialog box
// Author: Bin Zhu
// Date: 12/9/2019
//////////////////////////////////////////////////////////////

import java.lang.Math;
import javax.swing.JOptionPane;

public class Q3 {

	public static void main(String[] args) {
		//Enter radius of the cylinder
		String radiusStr = JOptionPane.showInputDialog(null, "Enter radius of the cylinder", 
				"Compute the volumn of the cylinder", JOptionPane.QUESTION_MESSAGE);
		double radius = Double.parseDouble(radiusStr);
		//Enter length of the cylinder
		String lengthStr = JOptionPane.showInputDialog(null, "Enter length of the cylinder", 
				"Compute the volumn of the cylinder", JOptionPane.QUESTION_MESSAGE);
		double length = Double.parseDouble(lengthStr);
		double area = 0.0;
		double volumn = 0.0;
		
		// compute the formula
		//System.out.println(Math.PI);
		area = radius*radius*Math.PI;
		volumn = area*length;
		
		// print out the answer
		//System.out.printf("The volumn pf the Cylinder is %.4f", volumn);
		JOptionPane.showMessageDialog(null, "The volumn of the cylinder is "+volumn);

	}

}
