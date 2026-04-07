package VendingMachineProject;

import java.util.Scanner;

public class JuiceSelection {

	public JuiceSelection() {
		// TODO Auto-generated constructor stub
	}

	public static Juice selectJuiceType() {
		System.out.println();
		System.out.println("Select Juice Type:");
		System.out.println("Press 1 for Orange Juice");
		System.out.println("Press 2 for Apple Juice");
		System.out.println("Press 3 for Mango Juice");
		System.out.println("Press 4 for Pineapple Juice");
		System.out.println("Press 5 for Mixed Fruit Juice");
		System.out.println("Press 0 for Go To Beverage Selection Menu");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Choice Number : ");
		int choice = input.nextInt();
		System.out.println();
		
		switch (choice) {

	    case 1:
	        System.out.println("You selected Orange Juice");
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
	        
	        Juice OrangeJuice = new Juice(size, suger, iceLevel, temperature, strength, extra);
			return OrangeJuice;

	    case 2:
	        System.out.println("You selected Apple Juice");
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
	        
	        Juice AppleJuice = new Juice(size, suger, iceLevel, temperature, strength, extra);
			return AppleJuice;

	    case 3:
	        System.out.println("You selected Mango Juice");
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
	        
	        Juice MangoJuice = new Juice(size, suger, iceLevel, temperature, strength, extra);
			return MangoJuice;
			
	    case 4:
	        System.out.println("You selected Pineapple Juice");
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
	        
	        Juice PineappleJuice = new Juice(size, suger, iceLevel, temperature, strength, extra);
			return PineappleJuice;

	    case 5:
	    	System.out.println("You selected Mixed Fruit");
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
	        
	        Juice MixedFruit = new Juice(size, suger, iceLevel, temperature, strength, extra);
			return MixedFruit;
			
	    case 0:
	    	System.out.println("You selected Go To Beverage Selection Menu");
	    	return (Juice) MachineService.processOfBeverageSelection();
	    	
	    default:
	        System.out.println("Invalid choice");
	        return selectJuiceType();
	}

	}
}
