class A
{
	static
	{
		System.out.println("i am in static block class A");
	}
}
class StaticDemo8
{
	static
	{
		System.out.println("i am in static block class staticdemo");
	}

	public static void main(String[] args)
	{
		A ob=new A();
		System.out.println("i am in main method");
	}
}