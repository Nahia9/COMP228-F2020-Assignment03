package exercise02;

import java.util.Scanner;

public class GameTesterDriver {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please Enter a game Tester name: ");
	    String name = scanner.next();
	    System.out.println("Enter the game tester type.\n1.true for FullTime\n2.false for PartTime");
	    boolean type = scanner.nextBoolean();
	    
	    GameTester ft;
	    double salary;
	    
	    if (type == true){
	        ft = new FullTimeGameTester();
	        ft.name = name;
	        ft.status = type;
	        salary = ft.calculate_salary();
	    }
	    else
	    {
	        System.out.println("Enter no. of hours worked :");
	        GameTester pt = new PartTimeGameTester();
	        pt.no_of_hours = scanner.nextInt();
	        pt.name = name;
	        salary = pt.calculate_salary();
	        scanner.close();
	        
	    }
	    System.out.println("Salary :"+ salary+"$");
	}
}
