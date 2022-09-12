package sample.arrays;

public class FindMaxandMinNumberInArray {

	private void maxNum(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}

		}
		System.out.println(max);

	}
	private void minNum(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
				
			}

		}
		System.out.println(min);

	}

	public static void main(String[] args) {
		int[] arr = { 45, 12, 57, 16, 30, 4 };
		FindMaxandMinNumberInArray fmm = new FindMaxandMinNumberInArray();
		fmm.maxNum(arr);
		fmm.minNum(arr);

	}

}
