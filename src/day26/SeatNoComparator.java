package day26;

import java.util.Comparator;

public class SeatNoComparator implements Comparator<Passenger>
{

	@Override
	public int compare(Passenger o1, Passenger o2) {
		if(o1.getSeatNo() > o2.getSeatNo())
			return 1;
		else if(o1.getSeatNo() < o2.getSeatNo())
			return -1;
		else
			return 0;
		
	}

}
