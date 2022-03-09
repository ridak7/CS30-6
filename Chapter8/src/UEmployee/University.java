package UEmployee;

import java.util.Scanner;

public class University {
	
	
	public static Employee createemployee() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = input.next();
		
		//record the first name
		
		String lastName = ("Enter last name: ");
		
		//record the last name
		
		
		int salary = Integer.valueOf("Enter salary: ");
		
		//record the salary
		
		
		

		//return (firstName + " " + lastName + "salary is" + salary);
	}
	
	
	
	
	
	public static void main (String[] args)
	{
		//Employee e = new Employee();
		
		//System.out.println(e.salary);
	}
}
