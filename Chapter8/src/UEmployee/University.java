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
		
		//record the salary
		
		
		

		//return (firstName + " " + lastName + "salary is" + salary);
	}
	
	
	
	
	
	public static void main (String[] args)
	{
		//Employee e = new Employee();
		
		//System.out.println(e.salary);
	}
}
