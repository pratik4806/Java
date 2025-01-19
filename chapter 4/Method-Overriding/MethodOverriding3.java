class A
{
	void show(int a)
	{
		System.out.println(a +  " Class A");
	}
}
class B extends A
{
	void show(int a)
	{
		System.out.println(a +  " Class B");
	}
}
class MethodOverriding3
{
	public static void main(String[] args)
	{
		A ob3=new B();
		B ob4=new B();
		ob3.show(20);
		ob4.show(23);
	}
}