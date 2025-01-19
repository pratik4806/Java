
class StaticMethodsDemo1
{
	void show1()
	{
		System.out.println("1");
	}
	static void show2()
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		StaticMethodsDemo1 ob=new StaticMethodsDemo1();
		ob.show1();

		// calling through class
		StaticMethodsDemo1.show2();

		// calling indepedently
		show2();
	}
}