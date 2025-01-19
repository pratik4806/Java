class Test
{
	void m1()
	{
		Xyz ob=new Xyz(this);
	}
}
class Xyz
{
	Xyz(Test t)
	{
		System.out.println(t);
	}
}
class ThisDemo8
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.m1();
	}
}