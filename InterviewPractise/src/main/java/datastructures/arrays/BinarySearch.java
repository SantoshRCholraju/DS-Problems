package datastructures.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,5,7,8,9,12};
		boolean value = binarySearch(arr, 8);
		System.out.println(value);
	}

	public static Boolean binarySearch(int[] arr, int n) {

		System.out.println("INSIDE fn");
		// given input array is sorted - so using binarySearch
		int length = arr.length;
		if (length < 1)
			return false;
		int low = 0;
		int high = length-1;
		while(low <= high) {
			int mid = (high + low) / 2;
			if (arr[mid] == n) {
				return true;
			} else if (arr[mid] < n) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return false;
		//return binary(0, length - 1, arr, n);

	}

	public static Boolean binary(int low, int high, int[] arr, int n) {

		if (low < high) {
			int mid = (high - low) / 2;
			if (arr[mid] == n)
				return true;
			else if (arr[mid] < n)
				binary(mid + 1, high, arr, n);
			else
				binary(low, mid - 1, arr, 1);
		}
		return false;
	}

}
