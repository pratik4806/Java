class Test
{
	void display(int a)
	{
		System.out.println(a);
	}
	void display(char a)
	{
		System.out.println(a);
	}
}
class MethodOverloading4
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display(10);
		t.display('d');
	}
}