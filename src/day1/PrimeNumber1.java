package day1;

public class PrimeNumber1 {

	public static void main(String[] args) {
		prime(97);

	}

	private static void prime(int num) {
		int counter=0;
		int iterationCounter=0;
		for(int i=1;i<=num;i++)
		{
			iterationCounter++;
			if(num%i==0)				//comparison operation  n times T(n) = O(n)
				counter++;
		}
		
		if(counter==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
		System.out.println("Iteration Counter "+iterationCounter);
		
	}

}
