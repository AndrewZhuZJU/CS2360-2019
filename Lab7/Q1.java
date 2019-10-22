import java.lang.Math;

public class Q1 {
	public static void main(String[] args) {
		System.out.println(reverse(123456789));
	}
	
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
}
