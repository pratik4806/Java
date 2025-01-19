class Employee
{
	String empid;
	String empname;

	Address addr;

	Employee(String empid1, String empname1, Address addr1)
	{
		empid=empid1;
		empname=empname1;
		addr=addr1;
	}

	void showEmpDetails()
	{
		System.out.println("-------------------------------------------------");
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Employee Address");
		System.out.println("Location : "+addr.location);
		System.out.println("City : "+addr.city);
		System.out.println("State : "+addr.state);
	}
}
class Address
{
	String location;
	String city;
	String state;

	Address(String location1, String city1, String state1)
	{
		location=location1;
		city=city1;
		state=state1;
	}	
}
class OneToOneDemo
{
	public static void main(String[] args)
	{
		Address ad1=new Address("#100, Sector 1", "Chandigarh", "Chandigarh");
		Employee emp1=new Employee("101", "deepak", ad1);
		emp1.showEmpDetails();

		Address ad2=new Address("#200, Sector 2", "Faridabad", "Haryana");
		Employee emp2=new Employee("102", "deepesh", ad2);
		emp2.showEmpDetails();
	}
}