class Test
{
	void display(Object a)
	{
		System.out.println("1");
	}
	void display(String a)
	{
		System.out.println("2");
	}
}
class MethodOverloading8
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display(null);
		t.display(t);
	}
}