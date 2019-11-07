public class Q2 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,1,2,3,4,5};
		
		int[] results = clean(array, 2);
		
		for(int i=0;i<results.length;++i) {
			System.out.printf("%d ",results[i]);
		}

	}
	
	public static int [] clean(int[] a, int n) {
		// remove flag for each element in array a
		boolean[] rm_flag = new boolean[a.length];
		int count = 0; //size of the return array
		
		//detect which element to remove
		for(int i=0;i<a.length;++i) {
			if(a[i]==n)
				rm_flag[i] = true;
			else {
				rm_flag[i] = false;
				count++;
			}
		}
		
		//assignment
		int[] results = new int[count];
		int pos = 0;
		for(int i=0;i<a.length;++i) {
			if(!rm_flag[i]) {
				results[pos] = a[i];
				pos++;
			}
		}
		return results;
		
	}
}
