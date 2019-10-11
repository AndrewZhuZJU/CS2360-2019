import java.util.Scanner;
import java.lang.Math;

public class Q3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two postive integers:");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		input.close();
		
		////////////////////////////////////////////////////////////////////
		//a
		long start = System.currentTimeMillis();
		int min_n = Math.min(n1, n2);
		int i = min_n;
		for(;i>1;--i) {
			int remainder1 = n1 % i;
			int remainder2 = n2 % i;
			if(remainder1==0 && remainder2==0) {
				break;
			}
		}
		long end = System.currentTimeMillis();

		System.out.printf("(a) The GCD of %d and %d is: %d, taking %d ms.\n", n1, n2, i, end-start);
		//System.out.printf("%d %d\n",end,start);
		
		////////////////////////////////////////////////////////////////////
		//b (better efficiency)
		start = System.currentTimeMillis();
		int max_n = Math.max(n1, n2);
		int A = max_n;
		int B = min_n;
		int remainder = 0;
		while(true){
			remainder = A % B;
			if(remainder==0) {
				break;
			}
			A = B;
			B = remainder;
		}
		end = System.currentTimeMillis();
		System.out.printf("(b) The GCD of %d and %d is: %d, taking %d ms.\n", n1, n2, B, end-start);
	}

}
