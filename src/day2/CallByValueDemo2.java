package day2;

public class CallByValueDemo2 {

	public static void main(String[] args) {
		String a="Alice";
		System.out.println(a);				//10
		test(a);
		System.out.println(a);				//10
		
	}

	private static void test(String tanvi) 
	{
		System.out.println(tanvi);			//10
		tanvi="Ben";
		System.out.println(tanvi);			//99
	}

}
