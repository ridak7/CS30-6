package UEmployee;

import java.util.Scanner;

public class University {
	
	
	public static Employee createemployee() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fName = input.next();
		
		System.out.println("Enter last name: ");
		String lName = input.next();
		
		System.out.println("Enter salary: ");
		int salary = input.nextInt();
		
		System.out.println("Are you part of the Staff or Faculty(S or F): ");
		String position = input.next();
		if (position.equalsIgnoreCase("F"))
		{
			System.out.println("What is you department name: ");
			String dname = input.next();
			return (new Faculty(fName, lName, salary, dname));
				
		}
		else if(position.equalsIgnoreCase("S")) {
			System.out.println("What is your job title: ");
			String tittle = input.next();
			return (new Staff(fName, lName, tittle, salary));
		}

		//return (fName + " " + lName + "salary is " + salary);
	}
	
	
	
	
	
	public static void main (String[] args)
	{
		//Employee e = new Employee();
		
		//System.out.println(e.salary);
	}
}
