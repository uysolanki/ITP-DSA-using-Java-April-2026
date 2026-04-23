package day5;

/*
  tourist : 100.75 dollar
  exchange : 99.5*100 = 9950			 
  
  minimum notes
  notes denominations : 7 
  enter the denominations in any order :  500 50 5 200 20 100 10
  
  minimum number of notes
  9530/500 = 19 notes 500    	balance 30
             1 note  20			balance 10
             1 note 10			balance nil
             
             print
             500 x 19
             20  x 1
             10  x 1
             
             minimum notes = 21
             change - nil
             
 */
public class MoneyExchange {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter No of Currency Denominations in your country");
//		int size=sc.nextInt();
//		double todaysRate=99.5;
//		int currency[]=new int[size];
//		System.out.println("Enter the " + size + " note denominations");
//		for(int i=0;i<size;i++)
//			currency[i]=sc.nextInt();
//		
//		System.out.println("Enter Amount in dollars ");
//		double amountinUSD=sc.nextDouble();
//		
//		double amountInINR=todaysRate*amountinUSD;
//		MergeSortDemo.mergeSort(currency, 0, size-1);
//		System.out.println(Arrays.toString(currency));
//		
		int arr1[]= {500, 200, 100, 50, 20, 10, 5};
		double amt=9950.0;
		//calculateExchange(amountInINR,currency);
		calculateExchange(amt,arr1);
		
	}

	private static void calculateExchange(double amountInINR, int[] currency) {
												//amount  9550.0
		int notes[]=new int[currency.length];	//                     i     
												//notes = [19, 0,  0,  1, 0, 0, 0]
												//curr =  [500,200,100,50,20,10,5]
		{
			for(int i=0;i<currency.length;i++)				//i=1
			{
				if(amountInINR>0)						    // amountInINR= 9550,50,0
				{
				notes[i]=(int)amountInINR/currency[i];
				amountInINR=(int)amountInINR%currency[i];
				}
			}
		}
		
		int totalNotes=0;
		for(int i=0;i<notes.length;i++)
		{
			if(notes[i]!=0)
			System.out.println(String.format("%-4d x %d", currency[i],notes[i]));
			
			totalNotes+=notes[i];
		}
		
		System.out.println("Total Notes "+ totalNotes);	
	}
	

}
