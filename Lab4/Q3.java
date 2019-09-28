import java.util.Scanner;
import java.lang.Math;

public class Q3 {

	public static void main(String[] args) {
		boolean is_valid = true; //detect user input
		//user side 
		Scanner input = new Scanner(System.in);
			
		//Enter your guess
		System.out.println("Enter your guess (paper-0, scissor-1, rock-2): ");
		int guess = input.nextInt();
		String str_guess = "";
		//close input
		input.close();
		
		switch(guess) {
		case 0:
			str_guess = "paper";
			break;
		case 1:
			str_guess = "scissor";
			break;
		case 2:
			str_guess = "rock";
			break;
		default:
			str_guess = "invalid";
			is_valid = false;
			System.out.println("Invalid input!");
		}
		
		//computer side
		int computer = (int)Math.random()*3;
		String str_computer = "";
		
		switch(computer) {
		case 0:
			str_computer = "paper";
			break;
		case 1:
			str_computer = "scissor";
			break;
		case 2:
			str_computer = "rock";
			break;
		default:
			System.out.println("Your code for random is not correct!");
		}
		System.out.printf("The computer is %s. You are %s. ", str_computer, str_guess);
		
		// judge
		String judge = "";
		if(computer==guess) {
			judge = "draw";
			System.out.println("It is a draw.");
		}
		else if((computer==2&&guess==1) || (computer==1&&guess==0) || (computer==0&&guess==2)) {
			judge = "lost";
			System.out.println("You lost.");
		}
		else {
			if(is_valid) {
				judge = "won";
				System.out.println("You won.");
			}
			else {
				System.out.println("Invalid game.");
			}
		}
		

	}

}
