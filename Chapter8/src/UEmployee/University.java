package UEmployee;

import java.util.Scanner;

public class University {
	
	
	public static Employee createemployee() 
	{
		String firstName = ("Enter first name: ");
		String lastName = ("Enter last name: ");
		int salary = Integer.valueOf("Enter salary: ");
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println(firstName);
		
		return (firstName + " " + lastName + "salary is" + salary);
		
	}
	
	
	
	
	
	
	
	public static void main (String[] args)
	{
		//Employee e = new Employee();
		
		//System.out.println(e.salary);
	}
}
