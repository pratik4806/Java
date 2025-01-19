
class Outer
{
	static class Inner
	{
		static void show()
		{
			System.out.println("1");
		}
	}
}
class StaticNestedClass2
{
	public static void main(String[] args)
	{
		Outer.Inner.show();
	}
}