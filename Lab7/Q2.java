import java.lang.Math;

public class Q2 {
	public static int reverse(int number) {
		int length = String.valueOf(number).length();
		
		int reverse_number = 0;
		
		for(int i=length;i>0;--i) {
			int digit = number%10;
			//System.out.println(digit);
			reverse_number += (int)(digit*Math.pow(10, i-1));
			number = number/10;
		}
		
		return reverse_number;
	}
	
	public static boolean isPrime(int number) {
		int upbound = (int)(Math.pow(number, 0.5));
		
		for(int i=2;i<=upbound;++i) {
			int remainder = number%i;
			if(remainder==0) {
				System.out.printf("%d can be divided by %d.\n",number, i);
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEmirp(int number) {
		int reverse_number = reverse(number);
		//System.out.println(reverse_number);
		return isPrime(reverse_number);
	}
	
	public static void main(String[] args) {
		int number = 324341;
		boolean flag_is_prime = isPrime(number);
		boolean flag_is_emirp = isEmirp(number);
		if(flag_is_prime) {
			System.out.printf("%d is a prime!\n", number);
		}
		else {
			System.out.printf("%d is not a prime!\n", number);
		}
		
		if(flag_is_emirp) {
			System.out.printf("%d is a emirp!\n", number);
		}
		else {
			System.out.printf("%d is not a emirp!\n", number);
		}
	}

}
