package VendingMachineProject;

import java.util.Scanner;

public class MachineService {

	public MachineService() {
		// TODO Auto-generated constructor stub
	}
	
	public static Beverage processOfBeverageSelection() {
		
		System.out.println();
		System.out.println("Select Your Beverage:");
		System.out.println("Press 1 for Coffee");
		System.out.println("Press 2 for Tea");
		System.out.println("Press 3 for Cold Drink");
		System.out.println("Press 4 for Juice");
		System.out.println("Press 5 for Mocktail");
		System.out.println("Press 6 for Cocktail");
		System.out.println("Press 7 for Wine");
		System.out.println("Press 0 to Exit");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Choice Number : ");
		int choice = input.nextInt();
		
		switch (choice) {

	    case 1:
	    	System.out.println();
	        System.out.println("You selected Coffee");
	        Coffee coffee = CoffeeSelection.selectCoffeeType();
	        return coffee;

	    case 2:
	    	System.out.println();
	        System.out.println("You selected Tea");
	        Tea tea = TeaSelection.selectTeaType();
	        return tea;
	        
	    case 3:
	    	System.out.println();
	        System.out.println("You selected Cold Drink");
	        Colddrink coldDrink = ColddrinkSelection.selectColddrinkType();
	        return coldDrink;

	    case 4:
	    	System.out.println();
	        System.out.println("You selected Juice");
	        Juice juice = JuiceSelection.selectJuiceType();
	        return juice;

	    case 5:
	    	System.out.println();
	        System.out.println("You selected Mocktail");
	        Mocktail mocktail = MocktailSelection.selectMocktailType();
	        return mocktail;

	    case 6:
	    	System.out.println();
	        System.out.println("You selected Cocktail");
	        Cocktail cocktail = CocktailSelection.selectCocktailType();
	        return cocktail;

	    case 7:
	    	System.out.println();
	        System.out.println("You selected Wine");
	        Wine wine = WineSelection.selectWineType();
	        return wine;

	    case 0:
	    	System.out.println();
	        System.out.println("Thank you! Visit again");
	        return null;

	    default:
	    	System.out.println();
	        System.out.println("Invalid choice! Please try again.");
	        return processOfBeverageSelection();
	}

	}
	
	public static boolean doyouWantContinue() {
		System.out.println();
		System.out.println("Do You Want Continue This Application ?");
		System.out.println("Type \"yes\" To Continue");
		System.out.println("Type \"no\" To Not Continue");
		System.out.println();
		System.out.print("Type Your Choice = ");
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		return choice.equalsIgnoreCase("yes");
	}

}
