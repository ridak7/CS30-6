package UEmployee;

public class Employee 
{
    private String firstName, lastName;
    double salary;
    
    public Employee(String fName, String lName, double sal )
    {
        firstName = fName;
        lastName = lName;
        salary = sal;
    }
    
    public String toString()
    {
        return(firstName+" "+lastName + "salary is " + salary);
    }
    
}