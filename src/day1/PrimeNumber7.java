package day1;

public class PrimeNumber7 {

	public static void main(String[] args) {
		System.out.println(prime(97)==-1?"Prime":"Not Prime");
	}

	private static int prime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num%i==0) return i;
		
		return -1;
	}

}
