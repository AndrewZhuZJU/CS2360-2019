import java.lang.Math;

public class Q3 {
	public static void  main(String[] args) {
		int last = 0; // last sum

		do {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;

			int sum = dice1 + dice2;

			System.out.printf("You roll %d + %d = %d.\n", dice1, dice2, sum);
			// first roll
			if (last == 0) {
				// carps
				if (sum == 2 || sum == 3 || sum == 12) {
					System.out.println("You lose.");// lose
					break;
				}

				// natural
				if (sum == 7 || sum == 11) {
					System.out.println("You win."); // win;
					break;
				}
			}
			
			if(last==sum) {
				System.out.println("You win.\n");
				break;
			}
			if(sum==7) {
				System.out.println("You lose.");
				break;
			}
			System.out.printf("Point is %d.\n", sum);
			last = sum;

		} while (true);
	}

}
