package day7;

import java.util.Arrays;

public class CricketTeams {

	public static void main(String[] args) {
		int players[]= {15,4,13,12};
		//int n=4;		
		//int n=2;
		int n=3;
		int max=findMaximumTeams(players,n);
		System.out.println(max);

	}

	private static int findMaximumTeams(int[] players, int n) {
		int start=1;
		int end=(int)Arrays.stream(players).mapToLong(num->num).sum();
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(teamsPossible(players,mid,n))
			{
				if(teamsPossible(players,mid+1,n))
				{
					start=mid+1;
				}
				else
				{
				return mid;
				}
			}
			else
			{
				end=mid-1;
			}
		}
		return 0;
	}

	private static boolean teamsPossible(int[] players, int mid, int n) {
		int requiredPlayers=mid*n;  //20
		int shortListedPlayers=0;   //14
		for(int p:players)
		{
			shortListedPlayers+=Math.min(p, mid);
		}
		if(shortListedPlayers>=requiredPlayers)
			return true;
		else
			return false;
	}

}
