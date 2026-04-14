package day4;

public class BusinessTargets2 {
public static void main(String[] args) {
	int money[] = { 300, 50, 100, 100, 150, 200,200 };
	int targets[] = { 400, 2000, 150, 500 };
	
	business(money,targets);
	
}

private static void business(int[] money, int[] targets) {

	int sum=0;					//1st target sum=0
	int k=0;					//1st target start counting from day 1
	for(int i=0;i<targets.length;i++)
	{
		int flag=0;
		for(int j=k;j<money.length;j++)
		{									//flag=1
				sum+=money[j];				//sum=0,300,350,450, 50
				if(sum>=targets[i])			//is 450>400 true		target 1  day 3
				{
					System.out.println("Target " +(i+1)+ "achived on  day " +(j+1));
					sum=sum-targets[i];
					k=j+1;
					flag=1;
					break;
				}	
		}
		if(targets[i]>sum && flag==0 )
		{
			System.out.println("Target " +(i+1)+ "not achived ");
			break;
		}
		
	}
}
}
