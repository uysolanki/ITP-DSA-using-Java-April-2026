package day4;

public class LinearSearchDemo5 {

	public static void main(String[] args) {
		int arr[] = { 8, 3, 5, 9, 7, 4 };

		int search = 5;
		int answer=linearSearch(arr,search);
		if (answer == -1)
			System.out.println("Not Found");
		else
			System.out.println("Found at Index "+answer);
	}

	private static int linearSearch(int arr[], int search) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		return -1;
	}
}
