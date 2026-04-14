package day2;

public class CallByValueDemo {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);				//10
		test(a);
		System.out.println(a);				//10
		
	}

	private static void test(int tanvi) 
	{
		System.out.println(tanvi);			//10
		tanvi=99;
		System.out.println(tanvi);			//99
	}

}
