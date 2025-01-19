class ReturnDemo2
{
	public static void main(String[] args)
	{
		ReturnDemo2 ob=new ReturnDemo2();
		int s=ob.m1();
		System.out.println(s);
	}
	int m1()
	{
		int no1=10, no2=20;
		return no1+no2;
	}
}