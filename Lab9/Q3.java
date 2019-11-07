
public class Q3 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 1, 2, 3, 5, 4,1,2 };
		//int[] array = { 1,1,1,2,2,2,3,4,5,6,7,5 };

		int[] results = duplicate(array);

		for (int i = 0; i < results.length; ++i) {
			System.out.printf("%d ", results[i]);
		}

	}

	public static int[] duplicate(int[] a) {
		// duplicate flag for each element in array a
		boolean[] dp_flag = new boolean[a.length];
		int count = 0; // size of the return array

		// detect which element is duplicate
		for (int i = 0; i < a.length; ++i) {
			dp_flag[i] = false;
			for (int j = i + 1; j < a.length; ++j) {
				if (a[i] == a[j]) {
					boolean flag = false; // already appear or not
					for (int k = 0; k < j; ++k) {
						if (a[k] == a[j] && dp_flag[k]) {
							flag = true;
							break;
						}
					}
					if (!flag) {
						dp_flag[i] = true;
						count++;
					}
					break;
				}
			}
		}

		// assignment
		int[] results = new int[count];
		int pos = 0;
		for (int i = 0; i < a.length; ++i) {
			if (dp_flag[i]) {
				results[pos] = a[i];
				pos++;
			}
		}
		return results;

	}
}
