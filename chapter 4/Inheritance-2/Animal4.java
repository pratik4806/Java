class Animal4
{
	int age;
	String color;

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

		Animal4 buzo=new Animal4();
		buzo.age=10;
		buzo.color="brown";
		System.out.println("Age : "+buzo.age);
		System.out.println("Color : "+buzo.color);
		buzo.eat();
		buzo.run();

		System.out.println("---------------------");

		Animal4 cat=new Animal4();
		cat.age=5;
		cat.color="black";
		System.out.println("Age : "+cat.age);
		System.out.println("Color : "+cat.color);
		cat.eat();
		cat.run();
	}
}