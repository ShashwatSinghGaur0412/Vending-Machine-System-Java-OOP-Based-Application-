package VendingMachineProject;

public class VendingMachine {

	public VendingMachine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("====== Welcome ======");
		System.out.println("Smart Beverage Vending Machine");
		System.out.println();
		System.out.println("Your drink, your rules.");
		System.out.println("Customize every sip your way.");
		System.out.println("Freshly prepared in seconds.");
		System.out.println("Quality you can taste.");
		System.out.println("Let’s brew happiness.");
		
		do {
			Beverage beverage = MachineService.processOfBeverageSelection();
			if (beverage == null) {
				break;
			}else {
				beverage.selectSize();
				beverage.selectSugarLevel();
				beverage.selectIceLevel();
				beverage.selectTemperature();
				beverage.addExtraIngredient();
				beverage.setStrength();
				beverage.calculatePrice();
				beverage.prepareDrink();
			}
		} while (MachineService.doyouWantContinue());
		System.out.println();
		System.out.println("Thank you for using the Smart Beverage Vending Machine ! I'm at your Service Sir!!");
		
	}
}
