interface I1
{
	default void show()
	{
		System.out.println("i am default method");
	}
}
class Test implements I1
{
	
}
class InterfaceNewFeatures1
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.show();
	}
}