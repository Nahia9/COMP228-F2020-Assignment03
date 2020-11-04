package exercise01;

public abstract class Insurance {
 
 protected String typeOfIns;
 protected double monthlyCost;
 
  
 public void settypeOfIns (String typeOfIns)
 
 {this.typeOfIns = typeOfIns;}
 
 public String gettypeOfIns()
 
 {return typeOfIns;}
 
 public double getmonthlyCost()
 
 {return monthlyCost;}
 
 abstract public void setInsuranceCost();
 
 abstract public void displayInfo();
 
}
