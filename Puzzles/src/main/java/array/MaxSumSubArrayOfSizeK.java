package array;

public class MaxSumSubArrayOfSizeK {
	public static int findMaxSumSubArray(int k, int[] arr) {
		System.out.println("k->" + k);
		int highestSum = 0;
		for (int i = 0; i < arr.length - k; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < i + k; j++) {
				System.out.println("j->"+j);
				sum += arr[j];
			}
			if (highestSum <= sum) {
				highestSum = sum;
				System.out.println("highestSum->" + highestSum);
			}
		}
		return highestSum;
	}

	public static void main(String[] args) {
		findMaxSumSubArray(3, new int[] { 3, 2, 1, 5, 1, 3, 2 });
	}
}