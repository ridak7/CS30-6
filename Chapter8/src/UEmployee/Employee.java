package UEmployee;

public class Employee 
{
    private String firstName, lastName;
    
    public Employee(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }
    
    public String toString()
    {
        return(firstName+" "+lastName);
    }
}