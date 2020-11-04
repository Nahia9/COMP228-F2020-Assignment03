package exercise01;



public class Life extends Insurance{
 
	private final double Life_Insurance_Cost = 100;
	
	public Life()
	{
		settypeOfIns("Life");
		setInsuranceCost();
	}
	public void setInsuranceCost()
	{
		monthlyCost = Life_Insurance_Cost;
	}
	
	public void displayInfo()
	{
		System.out.println("Insurance type: " + gettypeOfIns() + "\nMonthly Cost: $" + getmonthlyCost());
	}
}
