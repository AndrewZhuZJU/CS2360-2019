import java.lang.Math;

public class Q1 {

	public static void main(String[] args) {
		double[] array = new double[10];
		System.out.print("Original array:");
		for(int i=0;i<array.length;++i) {
			array[i] = Math.random()*10;
			System.out.printf("%.4f ",array[i]);
		}
		System.out.print("\nShited array:");
		ShiftRight(array);

	}
	
	public static void ShiftRight(double[] list) {
		double[] shiftArray = new double[list.length];
		
		for(int i=0;i<list.length;++i) {
			if(i<list.length-1) {
				shiftArray[i+1] = list[i];
			}
			else {
				shiftArray[0] = list[i];
			}
		}
		
		for(int i=0;i<shiftArray.length;++i) {
			System.out.printf("%.4f ",shiftArray[i]);
		}
	}
}
