package hw3;

public abstract class Automobile {

	public abstract void start();
	public abstract void drive();
	public abstract void halt();
	public abstract void turnoff();
	public abstract void washCar();
	
	public final void drivingMode()
	{
		start();
		
		for(int i=0; i<3; i++)
		{
			drive();
			halt();
		}
		
		turnoff();
		
		start();
		
		washCar();
		
		for(int i=0; i<2; i++)
		{
			drive();
			halt();
		}
		
		turnoff();
	}
}
