package UEmployee;

public  class Faculty {
	String memberstoring;
	String departmentname;
	
	public Faculty(String storing,String dname ) {
		memberstoring = storing;
		departmentname = dname;
	}
	
	public String toString() 
	{
		return(departmentname);
	}
}
