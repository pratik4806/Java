
class Outer
{
	private static int a=10;
	int b=20;
	static class Inner
	{
		void show()
		{
			System.out.println(a);
			//System.out.println(b);	error
		}
	}
}
class StaticNestedClass3
{
	public static void main(String[] args)
	{
		Outer.Inner ob=new Outer.Inner();
		ob.show();
	}
}