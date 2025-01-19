class CheckPrimeNo
{
	public static void main(String[] args)
	{
		int no=7;

		boolean b=false;

		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				b=true;
			}
		}
		if(b==true)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("No is prime");
		}
	}
}