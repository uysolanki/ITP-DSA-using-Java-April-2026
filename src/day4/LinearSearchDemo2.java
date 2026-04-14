package day4;

public class LinearSearchDemo2 {

	public static void main(String[] args) {
		linearSearch();
	}

	private static void linearSearch() {
		int arr[] = { 8, 3, 5, 9, 7, 4 };

		int search = 5;
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				flag = 1;
				break;
			}
		}

		if (flag == 0)
			System.out.println("Not Found");
		else
			System.out.println("Found");

	}
}
