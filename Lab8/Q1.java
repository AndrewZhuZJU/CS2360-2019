import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter password:");
		String password = input.nextLine();
		input.close();
		// conditional operator
		String result =checkPassword(password) ? "valid" : "invalid";
		System.out.printf("The password is %s.\n", result);

	}
	
	public static boolean checkPassword(String password) {
		// Rule: at least 10 characters
		if(password.length()<10)
			return false;
		
		// Rule: only digits and letters
		int cnt = 0;
		for(int i=0;i<password.length();++i) {
			if(Character.isDigit(password.charAt(i))) {
				cnt += 1;
			}else if(Character.isLetter(password.charAt(i)))
				continue;
			else
				return false;
		}
		
		//Rule: at least three digits
		if(cnt<3) {
			return false;
		}
		
		return true;
	}
}
