class Test
{
	void sum(int a, int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	void sum(float a, float b)
	{
		float res=a+b;
		System.out.println(res);
	}
}
class MethodOverloading
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.sum(10, 20);
		t.sum(10.4f, 20.7f);
	}
}