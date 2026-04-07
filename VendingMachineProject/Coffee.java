package VendingMachineProject;

public class Coffee extends Beverage {

	String size;
	String suger;
	String iceLevel;
	String temperature;
	String strength;
	String extra;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	
	public Coffee(String size, String suger, String iceLevel, String temperature, String strength, String extra) {
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
	    System.out.println();
	}

	public void selectSugarLevel() {
	    System.out.println("Sugar Level Selected : " + suger);
	    System.out.println("Sweetness adjusted as per your preference.");
	    System.out.println();
	}

	public void selectIceLevel() {
	    System.out.println("Ice Level Selected   : " + iceLevel);
	    System.out.println("Cooling level customized for you.");
	    System.out.println();
	}

	public void selectTemperature() {
	    System.out.println("Serving Temperature : " + temperature);
	    System.out.println("Temperature set for best taste experience.");
	    System.out.println();
	}

	public void setStrength() {
	    System.out.println("Drink Strength      : " + strength);
	    System.out.println("Strength balanced to match your mood.");
	    System.out.println();
	}

	public void addExtraIngredient() {
	    System.out.println("Extra Ingredient    : " + extra);
	    System.out.println("Extra ingredient added successfully.");
	    System.out.println();
	}

	public void calculatePrice() {
	    System.out.println("Reviewing your selections...");
	    System.out.println("Calculating final price based on customizations.");
	    System.out.println();
	}

	public void prepareDrink() {
	    System.out.println("Finalizing your customized Coffee...");
	    System.out.println("Mixing ingredients with precision ");
	    System.out.println("Almost ready...");
	    System.out.println("Your Coffee is ready. Enjoy your drink!");
	}

}
