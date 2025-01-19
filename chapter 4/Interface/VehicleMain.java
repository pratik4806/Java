interface Vehicle
{
	void start();
	void noOfGears(int a);
}
abstract class Bus implements Vehicle
{
	public void start()
	{
		System.out.println("bus starts with key");
	}
}
class Car implements Vehicle
{
	public void start()
	{
		System.out.println("car starts with key");
	}
	public void noOfGears(int gears)
	{
		System.out.println("Car has "+gears+" gears");
	}
}
class Scooter implements Vehicle
{
	public void start()
	{
		System.out.println("scooter starts with kick");
	}
	public void noOfGears(int gears)
	{
		System.out.println("Scooter has "+gears+" gears");
	}
}
class VehicleMain
{
	public static void main(String[] args)
	{
		//Vehicle v=new Vehicle();     we cannot create object of an interface

		// Bus b=new Bus();
		// b.start();
		// b.noOfGears(6);

		Car c = new Car();
		c.start();
		c.noOfGears(5);
	}
}