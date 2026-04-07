package VendingMachineProject;

import java.util.Scanner;

public class MocktailSelection {

	public MocktailSelection() {
		// TODO Auto-generated constructor stub
	}

	public static Mocktail selectMocktailType() {
		System.out.println();
		System.out.println("Select Mocktail Type:");
		System.out.println("Press 1 for Virgin Mojito");
		System.out.println("Press 2 for Blue Lagoon");
		System.out.println("Press 3 for Fruit Punch");
		System.out.println("Press 4 for Mint Cooler");
		System.out.println("Press 5 for Strawberry Fizz");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Choice Number : ");
		int choice = input.nextInt();
		System.out.println();
		
		switch (choice) {

	    case 1:
	        System.out.println("You selected Virgin Mojito");
	        System.out.println();
	        System.out.println("Setect Drink Size : ");
	        String size = CustomizationOfDrink.selectSize();
	        System.out.println("Setect Suger Level Of Drink : ");
	        String suger = CustomizationOfDrink.selectSugarLevel();
	        System.out.println("Setect Ice Level Of Drink : ");
	        String iceLevel = CustomizationOfDrink.selectIceLevel();
	        System.out.println("Setect Temperature Level Of Drink : ");
	        String temperature = CustomizationOfDrink.selectTemperature();
	        System.out.println("Setect Strength (Light / Regular / Strong) Of Drink : ");
	        String strength = CustomizationOfDrink.selectStrength();
	        System.out.println("Setect Extra Things For Drink : ");
	        String extra = CustomizationOfDrink.selectExtras();
	        
	        Mocktail VirginMojito = new Mocktail(size, suger, iceLevel, temperature, strength, extra);
			return VirginMojito;

	    case 2:
	        System.out.println("You selected Blue Lagoon");
	        System.out.println();
	        System.out.println("Setect Drink Size : ");
	        size = CustomizationOfDrink.selectSize();
	        System.out.println("Setect Suger Level Of Drink : ");
	        suger = CustomizationOfDrink.selectSugarLevel();
	        System.out.println("Setect Ice Level Of Drink : ");
	        iceLevel = CustomizationOfDrink.selectIceLevel();
	        System.out.println("Setect Temperature Level Of Drink : ");
	        temperature = CustomizationOfDrink.selectTemperature();
	        System.out.println("Setect Strength (Light / Regular / Strong) Of Drink : ");
	        strength = CustomizationOfDrink.selectStrength();
	        System.out.println("Setect Extra Things For Drink : ");
	        extra = CustomizationOfDrink.selectExtras();
	        
	        Mocktail BlueLagoon = new Mocktail(size, suger, iceLevel, temperature, strength, extra);
			return BlueLagoon;

	    case 3:
	        System.out.println("You selected Fruit Punch");
	        System.out.println();
	        System.out.println("Setect Drink Size : ");
	        size = CustomizationOfDrink.selectSize();
	        System.out.println("Setect Suger Level Of Drink : ");
	        suger = CustomizationOfDrink.selectSugarLevel();
	        System.out.println("Setect Ice Level Of Drink : ");
	        iceLevel = CustomizationOfDrink.selectIceLevel();
	        System.out.println("Setect Temperature Level Of Drink : ");
	        temperature = CustomizationOfDrink.selectTemperature();
	        System.out.println("Setect Strength (Light / Regular / Strong) Of Drink : ");
	        strength = CustomizationOfDrink.selectStrength();
	        System.out.println("Setect Extra Things For Drink : ");
	        extra = CustomizationOfDrink.selectExtras();
	        
	        Mocktail FruitPunch = new Mocktail(size, suger, iceLevel, temperature, strength, extra);
			return FruitPunch;
			
	    case 4:
	        System.out.println("You selected Mint Cooler");
	        System.out.println();
	        System.out.println("Setect Drink Size : ");
	        size = CustomizationOfDrink.selectSize();
	        System.out.println("Setect Suger Level Of Drink : ");
	        suger = CustomizationOfDrink.selectSugarLevel();
	        System.out.println("Setect Ice Level Of Drink : ");
	        iceLevel = CustomizationOfDrink.selectIceLevel();
	        System.out.println("Setect Temperature Level Of Drink : ");
	        temperature = CustomizationOfDrink.selectTemperature();
	        System.out.println("Setect Strength (Light / Regular / Strong) Of Drink : ");
	        strength = CustomizationOfDrink.selectStrength();
	        System.out.println("Setect Extra Things For Drink : ");
	        extra = CustomizationOfDrink.selectExtras();
	        
	        Mocktail MintCooler = new Mocktail(size, suger, iceLevel, temperature, strength, extra);
			return MintCooler;

	    case 5:
	        System.out.println("You selected Strawberry Fizz");
	        System.out.println();
	        System.out.println("Setect Drink Size : ");
	        size = CustomizationOfDrink.selectSize();
	        System.out.println("Setect Suger Level Of Drink : ");
	        suger = CustomizationOfDrink.selectSugarLevel();
	        System.out.println("Setect Ice Level Of Drink : ");
	        iceLevel = CustomizationOfDrink.selectIceLevel();
	        System.out.println("Setect Temperature Level Of Drink : ");
	        temperature = CustomizationOfDrink.selectTemperature();
	        System.out.println("Setect Strength (Light / Regular / Strong) Of Drink : ");
	        strength = CustomizationOfDrink.selectStrength();
	        System.out.println("Setect Extra Things For Drink : ");
	        extra = CustomizationOfDrink.selectExtras();
	        
	        Mocktail StrawberryFizz = new Mocktail(size, suger, iceLevel, temperature, strength, extra);
			return StrawberryFizz;

	    default:
	        System.out.println("Invalid choice");
	        return selectMocktailType();
	}

		
	}
}
