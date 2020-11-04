package exercise03;

import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args) {
			
		//INSTANTIATING MORTGAGE ARRAY
		Mortgage[] mortgages = new Mortgage[3];
		
		//INSTANTIATING SCANNER
		Scanner scanner = new Scanner(System.in);
		
		//Asking for INTEREST RATE
		System.out.print("Enter Current Interest Rate: ");
		double curIntRate = Double.parseDouble(scanner.nextLine());
		System.out.println();
		
		for (int i = 0; i < mortgages.length; i++) {
			//CAPTURING USER INPUT
			  System.out.println("We are offering two types of Mortgage: ");
			  System.out.println("Business Mortgage\t:Press[1]");
			  System.out.println("Personal Mortgage\t:Press[2]");
			  System.out.print("Select Mortgage\t: ");
			  int selection = Integer.parseInt(scanner.nextLine());
			  
			  System.out.print("Enter Mortgage Number: ");
			  int mortNum = Integer.parseInt(scanner.nextLine());
			  
			  System.out.print("Enter Customer Name: ");
			  String custName = scanner.nextLine();
			  
			  System.out.print("Enter Mortgage Amount: ");
			  double mortAmt = Double.parseDouble(scanner.nextLine());
			  
			  System.out.println("Mortgage Terms: ");
			  System.out.println("Short Term (1 Year)\t: Press[1]");
			  System.out.println("Medium Term (3 Years)\t: Press[2]");
			  System.out.println("Long Term (5 Years)\t: Press[3]");
			  System.out.print("Select Term\t: ");
			  int mortTerm = Integer.parseInt(scanner.nextLine());
			  
			//SELECTING MORTGAGE TERMS
			  switch(mortTerm) {
				  case 1:
				    mortTerm = 1;
				    break;
				  case 2:
					  mortTerm = 2;
				    break;
				  case 3:
					  mortTerm = 3;
					   break;
				  default:
					  mortTerm = 1;
			  }
			//INSTANTIATING MORTGAGE TYPE BASED ON SELECTION
			  switch(selection) {
			  case 1:	
				  selection = 2;
				  mortgages[i] = new PersonalMortgage(mortNum, custName, mortAmt, curIntRate, mortTerm);
				  System.out.println();
			    break;
			  case 2:
				  selection = 1;
				  mortgages[i] = new BusinessMortgage(mortNum, custName, mortAmt, curIntRate, mortTerm);
				  System.out.println();
			    break;
			  default:
				  System.out.println("Invalid Selection");
				  i -= 1;
			}
		}
		//CLOSING SCANNER
		scanner.close();
		
		//OUTPUTTING MORTGAGES INFORMATION
		for(Mortgage value : mortgages) {
			System.out.print(value.getMortgageInfo());
			System.out.println();
		}	
	}

}
