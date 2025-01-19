
class A
{
	void show1()
	{
		System.out.println("1");
	}
	static void show2()
	{
		this.show1();
		System.out.println("2");
	}
}
class StaticMethodsDemo5
{

	public static void main(String[] args)
	{
		A.show2();
	}
}