package VendingMachineProject;

public class Cocktail extends Beverage{
	
	String size;
	String suger;
	String iceLevel;
	String temperature;
	String strength;
	String extra;

	public Cocktail() {
		// TODO Auto-generated constructor stub
	}
	
	public Cocktail(String size, String suger, String iceLevel, String temperature, String strength, String extra) {
		this.size = size;
		this.suger = suger;
		this.iceLevel = iceLevel;
		this.temperature = temperature;
		this.strength = strength;
		this.extra = extra;
	}
	//Methods
	public void selectSize() {
	    System.out.println("Drink Size Selected : " + size);
	    System.out.println("This size is perfect for your refreshment.");
	}

	public void selectSugarLevel() {
	    System.out.println("Sugar Level Selected : " + suger);
	    System.out.println("Sweetness adjusted as per your preference.");
	}

	public void selectIceLevel() {
	    System.out.println("Ice Level Selected   : " + iceLevel);
	    System.out.println("Cooling level customized for you.");
	}

	public void selectTemperature() {
	    System.out.println("Serving Temperature : " + temperature);
	    System.out.println("Temperature set for best taste experience.");
	}

	public void setStrength() {
	    System.out.println("Drink Strength      : " + strength);
	    System.out.println("Strength balanced to match your mood.");
	}

	public void addExtraIngredient() {
	    System.out.println("Extra Ingredient    : " + extra);
	    System.out.println("Extra ingredient added successfully.");
	}

	public void calculatePrice() {
	    System.out.println("Reviewing your selections...");
	    System.out.println("Calculating final price based on customizations.");
	}

	public void prepareDrink() {
	    System.out.println("Finalizing your customized Cocktail...");
	    System.out.println("Mixing ingredients with precision 🍸");
	    System.out.println("Almost ready...");
	    System.out.println("Your Cocktail is ready. Enjoy your drink!");
	}


}
