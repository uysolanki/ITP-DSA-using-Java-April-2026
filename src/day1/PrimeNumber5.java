package day1;

public class PrimeNumber5 {

	public static void main(String[] args) {
		
		int ans=prime(97);
		if(ans==-1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

	private static int prime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++)
		if(num%i==0) return i;
		
		return -1;
	}

}
