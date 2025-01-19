class Student
{
	int rollno;
	String name;

	Student(int rollno1, String name1)
	{
		rollno = rollno1;
		name = name1;
	}
	void show()
	{
		System.out.println("Rollno : "+rollno+" & Name : "+name);
	}
}
class StudentMain
{
	public static void main(String[] args)
	{
		Student s1=new Student(101, "deepak");
		Student s2=new Student(102, "deepesh");
		Student s3=new Student(103, "amit");
	
		s1.show();
		s2.show();
		s3.show();
	}
}