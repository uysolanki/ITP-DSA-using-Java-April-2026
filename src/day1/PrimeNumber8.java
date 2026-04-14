package day1;

public class PrimeNumber8 {

	public static void main(String[] args) {
		//System.out.println(prime(97)?"Prime":"Not Prime");
	}

	private static boolean prime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num%i==0) return false;
	
		return true;
	}

}
