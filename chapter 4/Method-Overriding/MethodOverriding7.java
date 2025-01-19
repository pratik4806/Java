class A
{
	void show()
	{
		System.out.println("1");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("2");
	}
}
class MethodOverriding7
{
	public static void main(String[] args)
	{
		A ob3=new B();
		ob3.show();
	}
}