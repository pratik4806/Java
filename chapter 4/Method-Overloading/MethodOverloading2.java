class Test
{
	void display(String a)
	{
		System.out.println(a);
	}
	void display(int a)
	{
		System.out.println(a);
	}
}
class MethodOverloading2
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display(10);
		t.display("deepak");
	}
}