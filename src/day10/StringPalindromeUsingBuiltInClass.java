package day10;

public class StringPalindromeUsingBuiltInClass {

	public static void main(String[] args) {
		//String str="apple";
		//String str="madam";
		//String str="A nut for	a Jar of tuna";
		String str="A Nut For	A Jar Of Tuna";
		str=str.replaceAll("\\s+", "").toLowerCase();  //anutforajaroftuna  space tab enter
		System.out.println(new StringBuffer(str).reverse().toString().equals(str)?"Palindrome":"Not Palindrome");
		
	}

}
