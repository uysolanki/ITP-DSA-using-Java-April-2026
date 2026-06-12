package day35;

import java.util.Comparator;

public class RateComparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getRating().getRate()>o2.getRating().getRate())
			return -1;
		else if(o1.getRating().getRate()<o2.getRating().getRate())
			return 1;
		else return 0;
	}

}
