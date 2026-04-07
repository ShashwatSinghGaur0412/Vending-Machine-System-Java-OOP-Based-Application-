package VendingMachineProject;

import java.util.Scanner;

public class CocktailSelection {

	public CocktailSelection() {
		// TODO Auto-generated constructor stub
	}

	public static Cocktail selectCocktailType() {
		System.out.println();
		System.out.println("Select Cocktail Type:");
		System.out.println("Press 1 for Mojito");
		System.out.println("Press 2 for Margarita");
		System.out.println("Press 3 for Martini");
		System.out.println("Press 4 for Cosmopolitan");
		System.out.println("Press 5 for Bloody Mary");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Choice Number : ");
		int choice = input.nextInt();
		System.out.println();
		
		switch (choice) {

	    case 1:
	    	
	        System.out.println("You selected Mojito");
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
	        
	        Cocktail mojito = new Cocktail(size, suger, iceLevel, temperature, strength, extra);
			return mojito;

	    case 2:
	        System.out.println("You selected Margarita");
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
	        
	        Cocktail margarita = new Cocktail(size, suger, iceLevel, temperature, strength, extra);
			return margarita;

	    case 3:
	        System.out.println("You selected Martini");
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
	        
	        Cocktail martini = new Cocktail(size, suger, iceLevel, temperature, strength, extra);
			return martini;

	    case 4:
	        System.out.println("You selected Cosmopolitan");
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
	        
	        Cocktail cosmopolitan = new Cocktail(size, suger, iceLevel, temperature, strength, extra);
			return cosmopolitan;

	    case 5:
	        System.out.println("You selected Bloody Mary");
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
	        
	        Cocktail bloodyMary = new Cocktail(size, suger, iceLevel, temperature, strength, extra);
			return bloodyMary;
			

	    default:
	        System.out.println("Invalid choice");
	        return selectCocktailType();
	}

	}
}
