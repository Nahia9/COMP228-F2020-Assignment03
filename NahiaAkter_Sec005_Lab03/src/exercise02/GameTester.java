package exercise02;

public abstract class GameTester {
	
	String name;
    boolean status;
    int no_of_hours;
    public abstract double calculate_salary();
    
    
}
class FullTimeGameTester extends GameTester
{
    public double calculate_salary()
    {
        return 30000;
    }
}
class PartTimeGameTester extends GameTester
{
    
    PartTimeGameTester()
    {
        no_of_hours = 0;
    }
    public double calculate_salary()
    {
        return 20*no_of_hours;
    }
}


