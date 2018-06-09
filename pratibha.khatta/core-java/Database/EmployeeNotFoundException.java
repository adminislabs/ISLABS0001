package Database;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception 
{
    EmployeeNotFoundException()
    {
    	System.out.println("Employee with first letter z doesnot exist");
    }
}