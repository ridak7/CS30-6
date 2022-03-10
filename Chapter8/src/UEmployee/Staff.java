package UEmployee;

public class Staff {
	String jobtitle, memberstore;
	
	public Staff(String fName, String lName, String title,double salary ) 
	{
		jobtitle = title;
		//memberstore = storing;
	}
	
	public String tostring() 
	{
		return(jobtitle);
	}
}
