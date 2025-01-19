class A
{
	private int aa=10;
	private void show()
	{
		System.out.println("hi");
	}
}
class B extends A
{
	
}
class InheritanceMain2
{
	public static void main(String[] args)
	{
		B ob=new B();
		//System.out.println(ob.aa);
		ob.show();
	}
}