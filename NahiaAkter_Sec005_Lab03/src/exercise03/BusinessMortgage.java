package exercise03;

public class BusinessMortgage extends Mortgage{
	
	//OVERRIDDEN CONSTRUCTOR
			public BusinessMortgage(int mortNum, String custNam, double mortgageAmount, double intRate, int mortTerm) 
			{
				super(mortNum, custNam, mortgageAmount, intRate += 1, mortTerm);
			}
		
	

}
