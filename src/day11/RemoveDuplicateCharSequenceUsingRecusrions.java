package day11;

public class RemoveDuplicateCharSequenceUsingRecusrions {

	public static void main(String[] args) {
		//String str = "aaabbbaaca";
		String str = "abbbaca";
		String result = remove(str);
		System.out.println(result); 

	}

	static String remove(String str) //str="abc","bc"
	{
		if (str.length() <= 1)
			return str;
		
		if (str.charAt(0) == str.charAt(1)) 
		{
			char ch = str.charAt(0);
			int i = 0;

			while (i < str.length() && str.charAt(i) == ch) {
				i++;
			}
			return remove(str.substring(i));
		}
		return str.charAt(0) + remove(str.substring(1));
	}
}
