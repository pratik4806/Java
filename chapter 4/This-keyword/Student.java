class Student
{
	int rollno;
	String name;

	Student(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}

	void show()
	{
		System.out.println("Student Rollno : "+rollno);
		System.out.println("Student Name : "+name);
	}

	public static void main(String[] args)
	{
		Student s1=new Student(101, "deepak");
		s1.show();
	}
}