import java.util.Scanner;
import java.lang.Math;

public class Q2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			
		//Enter weight and height
		System.out.println("Enter weight (KG) and height (M): ");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		//close input
		input.close();
		
		//calculate BMI
		double BMI = weight/Math.pow(height, 2);
		if(BMI<16) {
			System.out.println("serious underweight");
		}
		else if(BMI<18) {
			System.out.println("underweight");
		}
		else if(BMI<25) {
			System.out.println("normal weight");
		}
		else if(BMI<30) {
			System.out.println("overweight");
		}
		else if(BMI<35) {
			System.out.println("seriously weight");
		}
		else {
			System.out.println("gravely weight");
		}
		

	}

}
