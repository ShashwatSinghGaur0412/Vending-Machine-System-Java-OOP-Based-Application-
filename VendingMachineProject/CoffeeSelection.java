package VendingMachineProject;

import java.util.Scanner;

public class CoffeeSelection {

	public CoffeeSelection() {
		// TODO Auto-generated constructor stub
	}

	public static Coffee selectCoffeeType() {
		System.out.println();
		System.out.println("Select Coffee Type:");
		System.out.println("Press 1 for Espresso");
		System.out.println("Press 2 for Cappuccino");
		System.out.println("Press 3 for Latte");
		System.out.println("Press 4 for Americano");
		System.out.println("Press 5 for Mocha");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Choice Number : ");
		int choice = input.nextInt();
		System.out.println();
		
		switch (choice) {

	    case 1:
	        System.out.println("You selected Espresso");
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
	        
	        Coffee Espresso = new Coffee(size, suger, iceLevel, temperature, strength, extra);
			return Espresso;

	    case 2:
	        System.out.println("You selected Cappuccino");
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
	        
	        Coffee Cappuccino = new Coffee(size, suger, iceLevel, temperature, strength, extra);
			return Cappuccino;

	    case 3:
	        System.out.println("You selected Latte");
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
	        
	        Coffee Latte = new Coffee(size, suger, iceLevel, temperature, strength, extra);
			return Latte;

	    case 4:
	        System.out.println("You selected Americano");
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
	        
	        Coffee Americano = new Coffee(size, suger, iceLevel, temperature, strength, extra);
			return Americano;

	    case 5:
	        System.out.println("You selected Mocha");
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
	        
	        Coffee Mocha = new Coffee(size, suger, iceLevel, temperature, strength, extra);
			return Mocha;

	    default:
	        System.out.println("Invalid choice");
	        return selectCoffeeType();
	}

	}
}
