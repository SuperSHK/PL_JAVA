package hw2;

public class AutomobileManufacturerTest {

	public static void main(String[] args) {
		
		int i;
		
		AutomobileManufacturer hyundai = AutomobileManufacturer.getInstance();
		AutomobilePriceTotal total;
		
		for (i=0; i<3; i++)
		{
			hyundai.addAutomobile(new Sonata());
		}
		
		for (i=0; i<2; i++)
		{
			hyundai.addAutomobile(new Grandeur());
		}
		
		for (i=0; i<1; i++)
		{
			hyundai.addAutomobile(new Genesis());
		}

		
		total = new AutomobilePriceTotal(hyundai.getAutomobileStock());
		
		System.out.println("====================");
		System.out.println("차량 가격의 합: " + total.getTotal());
		System.out.println("====================");
		
	}

}
