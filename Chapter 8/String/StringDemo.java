class StringDemo
{
	public static void main(String[] args)
	{
		String str1=new String("deepak");
		String str2=new String("deepak");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

		String name1="rahul";
		String name2="rahul";
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
	}
}