class Test
{
	void display(int a)
	{
		System.out.println("1");
	}
	int display(String a)
	{
		System.out.println("2");
		return 0;
	}
}
class MethodOverloading10
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display(10);
		t.display("deepak");
	}
}

//this program is not method overloading