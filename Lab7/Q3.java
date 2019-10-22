import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int line = input.nextInt();
		input.close();
		patternPrinter(line);

	}
	
	public static void patternPrinter(int line) {
		for(int i=0; i<line;++i) {
			for(int j=line-i;j>0;--j) {
				System.out.printf("%-6s"," ");
			}
			
			for(int j=0;j<=i;++j) {
				System.out.printf("%-6d",(int)(Math.pow(2, j)));
			}

			for(int j=i-1;j>=0;--j) {
				System.out.printf("%-6d",(int)(Math.pow(2, j)));
			}
			System.out.println();
		}
	}
}
