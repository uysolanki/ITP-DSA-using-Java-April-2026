package day4;

public class BusinessTargets {
public static void main(String[] args) {
	int money[] = { 300, 50, 100, 100, 150, 200,200 };
	int targets[] = { 400, 200, 150, 500 };
	
	business(money,targets);
	
}

private static void business(int[] money, int[] targets) {

	int sum=0;
	int k=0;
	for(int i=0;i<targets.length;i++)
	{
		int flag=0;
		for(int j=k;j<money.length;j++)
		{
				sum+=money[j];
				if(sum>=targets[i])
				{
					System.out.println("Target " +(i+1)+ "achived on  day " +(j+1));
					sum=sum-targets[i];
					k=j+1;
					flag=1;
					break;
				}	
		}
		if(targets[i]>sum && flag==0 )
			System.out.println("Target " +(i+1)+ "not achived ");
		
	}
}
}
