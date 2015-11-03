package hw3;

public class Sonata extends Automobile {

	@Override
	public void start()
	{
		System.out.println("소나타 부릉부릉");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	@Override
	public void drive()
	{
		System.out.println("소나타 우왜왜앵");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	@Override
	public void halt()
	{
		System.out.println("소나타 찌이이잉");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	@Override
	public void turnoff()
	{
		System.out.println("소나타 휴식휴식");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	@Override
	public void washCar()
	{
		System.out.println("소나타 깨끗깨끗");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
}
