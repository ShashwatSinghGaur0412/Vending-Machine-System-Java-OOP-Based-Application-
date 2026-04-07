package VendingMachineProject;

import java.util.Scanner;

public class WineSelection {

	public WineSelection() {
		// TODO Auto-generated constructor stub
	}

	public static Wine selectWineType() {
		System.out.println();
		System.out.println("Select Wine Type:");
		System.out.println("Press 1 for Red Wine");
		System.out.println("Press 2 for White Wine");
		System.out.println("Press 3 for Rose Wine");
		System.out.println("Press 4 for Sparkling Wine");
		System.out.println("Press 5 for Dessert Wine");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Choice Number : ");
		int choice = input.nextInt();
		System.out.println();
		
		switch (choice) {

	    case 1:
	        System.out.println("You selected Red Wine");
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
	        
	        Wine RedWine = new Wine(size, suger, iceLevel, temperature, strength, extra);
			return RedWine;

	    case 2:
	        System.out.println("You selected White Wine");
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
	        
	        Wine WhiteWine = new Wine(size, suger, iceLevel, temperature, strength, extra);
			return WhiteWine;

	    case 3:
	        System.out.println("You selected Rose Wine");
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
	        
	        Wine RosWine = new Wine(size, suger, iceLevel, temperature, strength, extra);
			return RosWine;

	    case 4:
	        System.out.println("You selected Sparkling Wine");
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
	        
	        Wine SparklingWine = new Wine(size, suger, iceLevel, temperature, strength, extra);
			return SparklingWine;

	    case 5:
	        System.out.println("You selected Dessert Wine");
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
	        
	        Wine DessertWine = new Wine(size, suger, iceLevel, temperature, strength, extra);
			return DessertWine;
			

	    default:
	        System.out.println("Invalid choice");
	        return selectWineType();
	}

	}
}
