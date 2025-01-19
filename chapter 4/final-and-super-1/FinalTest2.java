class A
{
	final void m1()
	{
		System.out.println("i am in class A");
	}
}
class B extends A
{
	//error - final method cannot be overridden
	void m1()
	{
		System.out.println("i am in class B");
	}
}
class FinalTest2
{
	public static void main(String[] args)
	{
		A ob=new B();
		ob.m1();
	}
}