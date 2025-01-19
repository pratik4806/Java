class ThisDemo5
{
	ThisDemo5()
	{
		System.out.println("1");
	}
	ThisDemo5(int no)
	{
		this();
		System.out.println("2 - " + no);
	}
	public static void main(String[] args)
	{
		ThisDemo5 ob2=new ThisDemo5(10);
	}
}