package hw3;

import java.util.ArrayList;

public class AutomobileList {

	private static AutomobileList singleton = new AutomobileList();
	
	
	private ArrayList <Automobile> automobileLot = new ArrayList <Automobile>();
	
	
	private AutomobileList()
	{ 
		System.out.println("instance produced");
	}
	
	
	public static AutomobileList getInstance()
	{
	   if(singleton == null)
	   singleton = new AutomobileList();
	   return singleton;
	}
	
	
	
	public ArrayList <Automobile> getAutomobileList()
	{
		return this.automobileLot;
	}
	
	public int getAutomobileCount()
	{
		return this.automobileLot.size();
	}
	
	
	
	public void addAutomobile (Automobile newAutomobile)
	{
		this.automobileLot.add(newAutomobile);
	}

	
}
