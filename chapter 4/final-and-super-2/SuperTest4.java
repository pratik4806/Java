class A
{
	A()
	{
		System.out.println("i am A class constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("i am in B class constructor");
	}
}

class SuperTest4
{
	public static void main(String[] args)
	{
		B ob=new B();
	}
}