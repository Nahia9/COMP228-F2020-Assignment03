package exercise03;

public class PersonalMortgage extends Mortgage{

	//OVERRIDDEN CONSTRUCTOR
		public PersonalMortgage(int mortNum, String custNam, double mortgageAmount, double intRate, int mortTerm) 
		{
			super(mortNum, custNam, mortgageAmount, intRate += 2, mortTerm);
		}
	
	
}
