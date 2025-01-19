class Birds
{
	void fly()
	{
		System.out.println("i am flying");
	}
}
class Animall
{
	void eat()
	{
		System.out.println("i am eating");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Animall buzo=new Animall();
		buzo.eat();

		Birds crow=new Birds();
		crow.fly();
	}
}