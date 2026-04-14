package day1;

public class PrimeNumber9 {

	public static void main(String[] args) {
		int n=1000;
		for(int i=1;i<n;i++)
			if(prime(i))
				System.out.println(i);
	}

	private static boolean prime(int num) {
		if(num==1) return false;
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num%i==0) return false;
	
		return true;
	}

}
