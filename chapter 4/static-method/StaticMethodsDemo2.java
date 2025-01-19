
class A
{
	void show1()
	{
		System.out.println("1");
	}
	static void show2()
	{
		System.out.println("2");
	}
}
class StaticMethodsDemo2
{

	public static void main(String[] args)
	{
		A ob=new A();
		ob.show1();

		A.show2();
		// show2();
	}
}