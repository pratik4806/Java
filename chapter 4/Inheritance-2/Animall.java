class Birds
{
	void fly()
	{
		System.out.println("i am flying");
	}

	public static void main(String[] args)
	{
		Animall buzo=new Animall();
		buzo.eat();

		Birds crow=new Birds();
		crow.fly();
	}
}
class Animall
{
	void eat()
	{
		System.out.println("i am eating");
	}
}