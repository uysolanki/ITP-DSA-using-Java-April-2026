package day4;

public class LinearSearchDemo6 {

	public static void main(String[] args) {
		int arr[] = { 8, 3, 5, 9, 7, 4 };

		int search = 5;
		int answer=linearSearch(arr,search);
		System.out.println(answer == -1?"Not Found": "Found at Index "+answer);
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
/*

loan amount 500 - paid on day 4

monday 300
tue  50
wed 100
thu  100
fri 150
sat 200
sun 200
*/



/*
how many targets do you have 3: 
enter your target 1 : 400  paid on day 3
enter your target 2 : 200  paid on day 5
enter your target 3 : 150  paid on day 6

how many targets do you have 4: 
enter your target 1 : 400  paid on day 3
enter your target 2 : 200  paid on day 5
enter your target 3 : 150  paid on day 6
enter your target 4 : 500  target not met

monday 300
tue  50
wed 100     -balance 50
thu  100
fri 150     -balance 100
sat 200	 	-balance 150   
sun 200
*/