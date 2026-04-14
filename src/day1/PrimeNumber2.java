package day1;

public class PrimeNumber2 {

	public static void main(String[] args) {
		prime(97);

	}

	private static void prime(int num) {
		int iterationCounter=0;
		int flag=0;
		for(int i=2;i<num;i++)
		{
			iterationCounter++;
			if(num%i==0)				//comparison operation  n times T(n) = O(n)
				{
				flag=1;
				break;
				}
		}
		
		if(flag==1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
		
		System.out.println("Iteration Counter "+iterationCounter);
		
	}

}
