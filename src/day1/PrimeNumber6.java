package day1;

public class PrimeNumber6 {

	public static void main(String[] args) {
		
		int ans=prime(97);
		System.out.println(ans==-1?"Prime":"Not Prime");
	}

	private static int prime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++)
		if(num%i==0) return i;
		
		return -1;
	}

}
