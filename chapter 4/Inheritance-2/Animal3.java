class Animal3
{
	int age=10;
	String color="black";

	void eat()
	{
		System.out.println("i am eating");
	}
	void run()
	{
		System.out.println("i am running");
	}

	public static void main(String[] args)
	{
		//System.out.println("hello");

		Animal3 buzo=new Animal3();
		System.out.println("Age : "+buzo.age);
		System.out.println("Color : "+buzo.color);
		buzo.eat();
		buzo.run();

		Animal3 cat=new Animal3();
		System.out.println("Age : "+cat.age);
		System.out.println("Color : "+cat.color);
		cat.eat();
		cat.run();
	}
}