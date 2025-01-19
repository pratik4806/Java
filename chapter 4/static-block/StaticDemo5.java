class StaticDemo5
{
	int no=10;

	static void m1()
	{
		System.out.println(no);
	}

	public static void main(String[] args)
	{
		StaticDemo5 ob=new StaticDemo5();
		System.out.println(ob.no);

		System.out.println(no);
	}
}