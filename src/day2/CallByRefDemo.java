package day2;

public class CallByRefDemo {

	public static void main(String[] args) {
		int arr[]= {10,20};
		System.out.println(arr[0]);	//10
		test(arr);
		System.out.println(arr[0]);	//10
	}
	
	public static void test(int brr[])
	{
		System.out.println(brr[0]);	//10
		brr[0]=99;
		System.out.println(brr[0]);	//99
	}

}
