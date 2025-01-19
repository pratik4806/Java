interface Vehicle
{
	void start();
}
class AnonymousInnerClass3
{
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle()
		{
			public void start()
			{
				System.out.println("starts with key");
			}
		};
		v.start();
	}
}