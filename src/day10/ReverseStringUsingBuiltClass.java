package day10;

public class ReverseStringUsingBuiltClass {

	public static void main(String[] args) {
		String str="apple";
		System.out.println("Before "+str);
		
//		StringBuffer sb=new StringBuffer(str);
//				sb.reverse();
		
		System.out.println("After " +new StringBuffer(str).reverse().toString());


	}

}
