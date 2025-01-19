class ReturnDemo4
{
	public static void main(String[] args)
	{
		ReturnDemo4 ob=new ReturnDemo4();
		System.out.println(ob.m1());
		ob.m2();
		//System.out.println(ob.m2());
	}
	int m1()
	{
		return 10;
	}
	void m2()
	{
		System.out.println("hi");
	}
}