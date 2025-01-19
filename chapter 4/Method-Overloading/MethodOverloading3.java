class Test
{
	void display(String a, int b)
	{
		System.out.println(a+", "+b);
	}
	void display(int a, String b)
	{
		System.out.println(a+", "+b);
	}
}
class MethodOverloading3
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display(10, "deepak");
		t.display("deepak", 10);
	}
}