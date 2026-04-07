package VendingMachineProject;

import java.util.Scanner;

public class CustomizationOfDrink {

	public CustomizationOfDrink() {
		// TODO Auto-generated constructor stub
	}

	//Methods
	
	//Size : Small / Medium / Large
	public static String selectSize() {

	    System.out.println();
	    System.out.println("Press 1 for Small");
	    System.out.println("Press 2 for Medium");
	    System.out.println("Press 3 for Large");
	    System.out.println();

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Your Choice Number : ");
	    int choice = input.nextInt();
	    System.out.println();

	    switch (choice) {
	        case 1:  
	        	System.out.println("Small selected");
	        	System.out.println();
	        	return "Small";
	        	
	        case 2: 
	        	System.out.println("Medium selected"); 
	        	System.out.println();
	        	return "Medium";
	        	
	        case 3: 
	        	System.out.println("Large selected"); 
	        	System.out.println();
	        	return "Large";
	        	
	        default: 
	        	System.out.println("Invalid choice");
	        	System.out.println();
	        	return selectSize();
	        	
	    }
	}


	//Sugar Level : No / Low / Medium / High
	public static String selectSugarLevel() {

	    System.out.println();
	    System.out.println("Press 1 for No Sugar");
	    System.out.println("Press 2 for Low Sugar");
	    System.out.println("Press 3 for Medium Sugar");
	    System.out.println("Press 4 for High Sugar");
	    System.out.println();

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Your Choice Number : ");
	    int choice = input.nextInt();
	    System.out.println();

	    switch (choice) {
	        case 1: 
				System.out.println("No Sugar selected"); 
				System.out.println();
				return "No Sugar";
				
	        case 2: 
				System.out.println("Low Sugar selected"); 
				System.out.println();
				return "Low Sugar";
				
	        case 3: 
				System.out.println("Medium Sugar selected"); 
				System.out.println();
				return "Medium Sugar";
				
	        case 4: 
				System.out.println("High Sugar selected"); 
				System.out.println();
				return "High Sugar";
				
	        default: 
				System.out.println("Invalid choice");
				System.out.println();
				return selectSugarLevel();
				
	    }
	}


	//Ice Level : No / Low / Medium / Extra
	public static String selectIceLevel() {

	    System.out.println();
	    System.out.println("Press 1 for No Ice");
	    System.out.println("Press 2 for Low Ice");
	    System.out.println("Press 3 for Medium Ice");
	    System.out.println("Press 4 for Extra Ice");
	    System.out.println();

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Your Choice Number : ");
	    int choice = input.nextInt();
	    System.out.println();

	    switch (choice) {
	        case 1: 
				System.out.println("No Ice selected"); 
				System.out.println();
				return "No Ice";
				
	        case 2: 
				System.out.println("Low Ice selected"); 
				System.out.println();
				return "Low Ice";
				
	        case 3: 
				System.out.println("Medium Ice selected"); 
				System.out.println();
				return "Medium Ice";
				
	        case 4: 
				System.out.println("Extra Ice selected"); 
				System.out.println();
				return "Extra Ice";
				
	        default: 
				System.out.println("Invalid choice");
				System.out.println();
				return selectIceLevel();
				
	    }
	}


	//Temperature : Hot / Cold
	public static String selectTemperature() {

	    System.out.println();
	    System.out.println("Press 1 for Hot");
	    System.out.println("Press 2 for Cold");
	    System.out.println();

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Your Choice Number : ");
	    int choice = input.nextInt();
	    System.out.println();

	    switch (choice) {
	        case 1:
				 System.out.println("Hot selected"); 
				 System.out.println();
				return "Hot";
				
	        case 2:
				 System.out.println("Cold selected"); 
				 System.out.println();
				return "Cold";
				
	        default: 
				System.out.println("Invalid choice");
				System.out.println();
				return selectTemperature();
				
	    }
	}


	//Strength : Light / Regular / Strong
	public static String selectStrength() {

	    System.out.println();
	    System.out.println("Press 1 for Light");
	    System.out.println("Press 2 for Regular");
	    System.out.println("Press 3 for Strong");
	    System.out.println();

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Your Choice Number : ");
	    int choice = input.nextInt();
	    System.out.println();

	    switch (choice) {
	        case 1: 
				System.out.println("Light selected"); 
				System.out.println();
				return "Light";
				
	        case 2: 
				System.out.println("Regular selected"); 
				System.out.println();
				return "Regular";
				
	        case 3: 
				System.out.println("Strong selected"); 
				System.out.println();
				return "Strong";
				
	        default: 
				System.out.println("Invalid choice");
				System.out.println();
				return selectStrength();
				
	    }
	}


	//Extras : Milk / Lemon / Mint / Cream
	public static String selectExtras() {

	    System.out.println();
	    System.out.println("Press 1 for Milk");
	    System.out.println("Press 2 for Lemon");
	    System.out.println("Press 3 for Mint");
	    System.out.println("Press 4 for Cream");
	    System.out.println("Press 5 for Nothing");
	    System.out.println();

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Your Choice Number : ");
	    int choice = input.nextInt();
	    System.out.println();

	    switch (choice) {
	        case 1: 
				System.out.println("Milk added"); 
				System.out.println();
				return "Milk";
				
	        case 2: 
				System.out.println("Lemon added"); 
				System.out.println();
				return "Lemon";
				
	        case 3: 
				System.out.println("Mint added"); 
				System.out.println();
				return "Mint";
				
	        case 4: 
				System.out.println("Cream added"); 
				System.out.println();
				return "Cream";
				
	        case 5: 
				System.out.println("Nothing added");
				System.out.println();
				return "Nothing";
				
	        default: 
				System.out.println("Invalid choice");
				System.out.println();
				return selectExtras();
				
	    }
	}


}
