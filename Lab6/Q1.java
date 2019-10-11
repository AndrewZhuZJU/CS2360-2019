import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int user_input = 0; //user input
		int num_postive = 0; //number of positive
		int num_negative = 0; //number of negative
		int num_input = 0; //number of user inputs (positive and negative)
		int sum = 0; // sum of all user inputs
		
		System.out.println("Enter integers (ends with 0):");
		
		do {
			user_input = input.nextInt();
		
			if(user_input>0) {
				num_postive += 1;
				num_input += 1;
			}
			else if(user_input<0) {
				num_negative += 1;
				num_input += 1;
			}
			sum += user_input;
			
		}while(user_input!=0);
		
		input.close();
		
		if(num_input!=0) {
			double avg = 1.0*sum/num_input;
			System.out.printf(" Number of postive is: %d\n Number of negative is: %d\n The sum is: %d\n The average is: %.3f\n",
					num_postive, num_negative, sum, avg);
		}
		else {
			System.out.println("None non-zero input!");
		}

	}

}
