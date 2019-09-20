//Summing the digits in an integer

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		while(true) {
			//Enter an integer between 0 and 1000
			System.out.println("Enter an integer between 0 and 1000:");
			number = input.nextInt();
			if(number>0 && number<1000) {
				break;
			}
			else {
				System.out.println("The number is invalid! Please enter an integer between 0 and 1000!");
			}
		}
		
		int hundreds = number/100;
		int tens = (number - hundreds*100)/10;
		int units = number%10;
		System.out.printf("hundreds:%d, tens:%d, units:%d\n", hundreds, tens, units);
		
		int sum = hundreds + tens + units;
		System.out.println("The sum is:" + sum);

	}

}
