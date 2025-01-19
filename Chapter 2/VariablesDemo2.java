class VariablesDemo2
{
	int d;		//instance variable
	int f=700;
	public static int e=500;	//static variable
	void sum()
	{
		int a=100;	//local variable
	}
	void mul()
	{
		int b=400;		//local variable
		//int c=a+b;	//error because we cannot use local variable a inside mul() method
		int c=d+b+e;	
	}
	
	static void divide()
	{
		int rollno=101;	//local variable
		//int res=d;	//error because d is not static variable
	}
	public static void main(String[] args)
	{
		VariablesDemo2 ob=new VariablesDemo2();
		ob.sum();
		System.out.println(e);
		System.out.println(ob.e);
		System.out.println(VariablesDemo2.e);
	}
}