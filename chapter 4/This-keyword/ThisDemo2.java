class ThisDemo2
{
	int no=10;

	void m1(int no)
	{
		//System.out.println(no);
		System.out.println(this.no);
	}

	public static void main(String[] args)
	{
		ThisDemo2 ob=new ThisDemo2();
		ob.m1(20);
		System.out.println("this - " + ob.no);
	}
}