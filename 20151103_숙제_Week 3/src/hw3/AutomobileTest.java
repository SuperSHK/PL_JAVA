package hw3;

import java.util.Scanner;

final public class AutomobileTest {

	public static void main(String[] args) {
		
		
		Automobile sonata = new Sonata();
		Automobile grandeur = new Grandeur();
		Automobile genesis = new Genesis();
		Automobile avante = new Avante();
	
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("다음 중 차종을 하나 골라 영문으로 입력해주세요\n");
		System.out.println("Sonata");
		System.out.println("Grandeur");
		System.out.println("Genesis");
		System.out.println("Avante");
		
		System.out.print("\n입력: ");
		
		String carType = userInput.next();
		
		
		
		if(carType.equals("Sonata"))
		{
			System.out.println("\n\n************");
			sonata.drivingMode();
			System.out.println("************\n\n");
		}
		
		
		else if(carType.equals("Grandeur"))
		{
			System.out.println("\n\n************");
			grandeur.drivingMode();
			System.out.println("************\n\n");
		}
		
		
		else if(carType.equals("Genesis"))
		{
			System.out.println("\n\n**************");
			genesis.drivingMode();
			System.out.println("**************\n\n");
		}
		
		
		else if(carType.equals("Avante"))
		{
			System.out.println("\n\n************");
			avante.drivingMode();
			System.out.println("************\n\n");
		}
		
	}
	
}
