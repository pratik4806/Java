class Parent
{
}
class Child extends Parent
{
}
class Child2 extends Parent
{
}
class A
{
	Parent show()
	{
		System.out.println("1");
		return new Parent();
	}
}
class B extends A
{
	Child show()
	{
		System.out.println("2");
		return new Child();
	}
}
class MethodOverriding6
{
	public static void main(String[] args)
	{
		A ob3=new B();
		ob3.show();
	}
}