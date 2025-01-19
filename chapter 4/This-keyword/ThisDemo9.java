class Test
{
	Test m1()
	{
		return this;
	}
}
class ThisDemo9
{
	public static void main(String[] args)
	{
		Test ob=new Test();
		Test t=ob.m1();
		System.out.println(t);
	}
}