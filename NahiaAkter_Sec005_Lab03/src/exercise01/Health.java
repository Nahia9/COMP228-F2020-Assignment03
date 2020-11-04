package exercise01;



public class Health extends Insurance {
	
	private final double Health_Insurance_Cost = 200;
	
	public Health()
	{
		settypeOfIns("Health");
		setInsuranceCost();
	}
	public void setInsuranceCost()
	{
		monthlyCost = Health_Insurance_Cost;
	}
	
	public void displayInfo()
	{
		System.out.println("Insurance type: " + gettypeOfIns() + "\nMonthly Cost: $" + getmonthlyCost());
	}
}
