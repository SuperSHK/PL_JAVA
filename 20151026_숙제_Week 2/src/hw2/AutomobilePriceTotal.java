package hw2;

import java.util.ArrayList;

public class AutomobilePriceTotal {

	private ArrayList <Automobile> automobileStock;
	
	
	public AutomobilePriceTotal(ArrayList <Automobile> automobiles)
	{
		this.automobileStock = automobiles;
	}
	
	
	public int getTotal()
	{
		int total = 0;
		
		for (Automobile automobile: this.automobileStock)
		{
			total += automobile.getPrice();
		}
		
		return total;
		
	}
}
