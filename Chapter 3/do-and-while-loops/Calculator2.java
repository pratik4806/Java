import java.util.Scanner;

class Calculator2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 1st No - ");
		int no1=s.nextInt();

		System.out.println("Enter 2nd No - ");
		int no2=s.nextInt();
		
		System.out.println("Enter symbol (+,-,*,/)");
		String sym=s.next();

		switch(sym)
		{
			case "+": System.out.println("result is : "+(no1+no2));
				  break;
			case "-": System.out.println("result is : "+(no1-no2));
				  break;
			case "*": System.out.println("result is : "+(no1*no2));
				  break;
			case "/": System.out.println("result is : "+(no1/no2));
				  break;
			default: System.out.println("invalid");
				 break;
		}
	}
}