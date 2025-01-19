
class A
{
	static void show2()
	{
		System.out.println("2");
	}
}
class StaticMethodsDemo3
{
	

	public static void main(String[] args)
	{
		A ob=new A();
		A.show2();
	}
}