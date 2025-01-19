class A
{
	void show1()
	{
		System.out.println("i m in class A");
	}
}
class B extends A
{
	void show2()
	{
		super.show1();
		System.out.println("im in class B");
	}
}

class SuperTest2
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.show2();
	}
}