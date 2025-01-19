class UnboxingDemo
{
	public static void main(String[] args)
	{
		Integer i=new Integer(20);
		int a=i.intValue();		//explicitly
		int aa=i;			//unboxing (int aa=i.intValue())

		System.out.println(i);
		System.out.println(a);
		System.out.println(aa);
	}
}