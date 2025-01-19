class PrintFactorial
{
	public static void main(String[] args)
	{
		int no=10;

		int fact=1;
		for(int i=1; i<=no; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is "+fact);
	}
}