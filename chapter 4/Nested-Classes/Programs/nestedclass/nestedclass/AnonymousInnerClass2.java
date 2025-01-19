abstract class Vehicle
{
	abstract void start();
}
class AnonymousInnerClass2
{
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle()
		{
			void start()
			{
				System.out.println("starts with key");
			}
		};
		v.start();
	}
}