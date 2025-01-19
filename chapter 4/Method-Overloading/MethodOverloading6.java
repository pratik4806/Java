class Test
{
	void display(int a)
	{
		System.out.println("1 : "+a);
	}
	void display(char c)
	{
		System.out.println("2 : "+c);
	}
}
class MethodOverloading6
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.display('d');
		t.display(10);
	}
}