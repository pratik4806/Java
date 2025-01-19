class Vehicle
{
	void start()
	{
		System.out.println("1");
	}
}
class AnonymousInnerClass4
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