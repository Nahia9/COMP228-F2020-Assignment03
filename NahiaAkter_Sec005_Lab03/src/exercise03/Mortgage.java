package exercise03;

public abstract class Mortgage implements MortgageConstants {
	private int mortgageNum;
	private String customerName;
	private  double mortgageAmount;
	private double rateOfInterest;
	private int term;
	
	public int getmortgageNum()
	{
		return mortgageNum;
	}
	
	public void setmortgageNum(int mortgageNum)
	{
		this.mortgageNum = mortgageNum;
	}
	
	public String getcustomerName()
	{
		return customerName;
	}
	
	public void setcustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	
	public double getmortgageAmount()
	{
		return mortgageAmount;
	}
	
	public void setmortgageAmount(double mortgageAmount)
	{
		if(mortgageAmount <= 0)
			throw new IllegalArgumentException("Mortgage cannot be 0 or less than 0");
		if(mortgageAmount > maxMortgageAmt)
			throw new IllegalArgumentException("Mortgage cannot be greater than 300000");
		this.mortgageAmount = mortgageAmount;
	}		
		
	public double getrateOfInterest()
	{
		return rateOfInterest;
	}
	
	public void setrateOfInterest(double intRate)
	{
		this.rateOfInterest = intRate;
	}
	
	public int getTerm()
	{
		return term;
	}
	
	public void setTerm(int term)
	{
		if(term != shortTerm || term != mediumTerm || term != longTerm)
		this.term = shortTerm;
		else		
		this.term = term;
	}
	
	//CONSTRUCTOR
		public Mortgage(int mortNum, String custNam, double mortgageAmount, double intRate, int mortTerm) 
		{
			this.setmortgageNum(mortNum);
			this.setcustomerName(custNam);
			this.setmortgageAmount(mortgageAmount);
			this.setrateOfInterest(intRate);
			this.setTerm(mortTerm);
		}
	
	public String getMortgageInfo() 
	{
	     return ("MortgageNumber=" + mortgageNum + "\n CustomerName: " + customerName + "\n Mortgage Amount: " +
	
	    		 mortgageAmount + "\n Interest Rate: " + rateOfInterest + "\n term: " + term );

	}
		
}

