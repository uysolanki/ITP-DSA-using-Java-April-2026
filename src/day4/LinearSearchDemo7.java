package day4;

public class LinearSearchDemo7 {

	public static void main(String[] args) {
		int arr[] = { 8, 3, 5, 9, 7, 4 };
		int search = 5;
		System.out.println(linearSearch(arr,search) == -1?"Not Found": "Found at Index "+linearSearch(arr,search));
	}

	private static int linearSearch(int arr[], int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		return -1;
	}
}
