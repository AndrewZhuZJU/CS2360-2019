import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number and guess:");
		double number = input.nextDouble();
		double guess = input.nextDouble();
		input.close();
		if(number<=0 && guess<=0) {
			System.out.println("Non-postive input");
			return;
		}
		double root = approximation(number, guess);
		
		System.out.printf("The approximation root of %.4f is %.4f.\n", number, root);

	}
	
	public static double approximation(double number, double guess) {
		double lastGuess = guess;
		double nextGuess = Double.NEGATIVE_INFINITY;
		while(true) {
			nextGuess = (lastGuess + number/lastGuess)/2;
			// System.out.println(nextGuess);
			if(Math.abs(nextGuess - lastGuess)<0.000001)
				break;
			lastGuess = nextGuess;
		}
		return nextGuess;
	}
}
