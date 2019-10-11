import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int line = input.nextInt();
		input.close();
		if(line>1 && line<15) {
			DisplayPyramid(line);
		}
		else {
			System.out.println("The number of line should between 1 and 15!");
		}
		

	}
	
	public static void DisplayPyramid(int line) {
		for(int i=1; i<=line;++i) {
			for(int j=line-i;j>0;--j) {
				System.out.print("  ");
			}
			
			for(int j=i;j>0;--j) {
				System.out.printf("%d ",j);
			}

			for(int j=2;j<=i;++j) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}

}
