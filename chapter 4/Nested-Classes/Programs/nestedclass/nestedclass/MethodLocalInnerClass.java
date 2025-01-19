class Outer
{
	void show()
	{
		System.out.println("1");
		class Inner
		{
			void show2()
			{
				System.out.println("2");
			}
		}

		Inner i=new Inner();
		i.show2();
	}
}
class MethodLocalInnerClass
{
	public static void main(String[] args)
	{
		Outer ob=new Outer();
		ob.show();
	}
}