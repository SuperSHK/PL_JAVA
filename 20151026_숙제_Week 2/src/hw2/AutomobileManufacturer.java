package hw2;

import java.util.ArrayList;

public class AutomobileManufacturer {

	private static AutomobileManufacturer singleton = new AutomobileManufacturer();
	
	
	private ArrayList <Automobile> automobileStock = new ArrayList <Automobile>();
	
	
	private AutomobileManufacturer()
	{ 
		System.out.println("instance produced");
	}
	
	
	public static AutomobileManufacturer getInstance()
	{
	   if(singleton == null)
	   singleton = new AutomobileManufacturer();
	   return singleton;
	}
	
	
	
	public ArrayList <Automobile> getAutomobileStock()
	{
		return this.automobileStock;
	}
	
	public int getAutomobileCount()
	{
		return this.automobileStock.size();
	}
	
	
	
	public void addAutomobile (Automobile newAutomobile)
	{
		this.automobileStock.add(newAutomobile);
	}
	
	public void addAutomobile (Automobile newAutomobile, int count)
	{
		int i;
		for (i=0; i<count; i++)
		{
			this.addAutomobile(newAutomobile);
		}
	}
	
}
