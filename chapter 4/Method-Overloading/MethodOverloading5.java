class Test
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class MethodOverloading5
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display('d');
		t.display(10);
	}
}