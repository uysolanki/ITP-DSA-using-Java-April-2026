package day4;

public class LinearSearchDemo4 {

	public static void main(String[] args) {
		int arr[] = { 8, 3, 5, 9, 7, 4 };

		int search = 15;
		int answer=linearSearch(arr,search);
		if (answer == 0)
			System.out.println("Not Found");
		else
			System.out.println("Found");
	}

	private static int linearSearch(int arr[], int search) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				flag = 1;
				break;
			}
		}
		return flag;
	}
}
