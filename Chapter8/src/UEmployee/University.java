package UEmployee;

import java.util.Scanner;

public class University {
	
	
	public static Employee createemployee() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = input.next();
		
		System.out.print("Enter last name: ");
		String lastName = input.next();
		
		System.out.print("Enter salary: ");
		int salary = input.nextInt();
		
		System.out.print("Are you part of the Staff or Faculty(S or F): ");
		String position = input.next();
		if (position = "F") {
			
		}

		//return (firstName + " " + lastName + "salary is " + salary);
	}
	
	
	
	
	
	public static void main (String[] args)
	{
		//Employee e = new Employee();
		
		//System.out.println(e.salary);
	}
}
