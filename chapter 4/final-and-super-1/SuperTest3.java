class A
{
	void show()
	{
		System.out.println("i m in class A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("im in class B");
	}
	void m1()
	{
		System.out.println("1");
		super.show();
		System.out.println("2");
	}
}

class SuperTest3
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.show();
		ob.m1();
	}
}