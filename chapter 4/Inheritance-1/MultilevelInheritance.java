class A
{
	void show1()
	{
		System.out.println("i am in class A");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("i am in class B");
	}
}
class C extends B
{
	void show3()
	{
		System.out.println("i am in class C");
	}
}
class MultilevelInheritance
{
	public static void main(String[] args)
	{
		A ob1=new A();
		ob1.show1();
		// ob1.show2();
		// ob2.show3();

		B ob2=new B();
		ob2.show2();
		ob2.show1();
		//ob2.show3();

		C ob3=new C();
		ob3.show3();
		ob3.show2();
		ob3.show1();
	}
}