import bankapi.in.smartprogramming.CarLoan;
import bankapi.in.smartprogramming.HomeLoan;
import java.util.Scanner;

class BankApp
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Which type of loan you want to choose ?\n1. Car Loan\n2. Home Loan");

		int i=s.nextInt();
		if(i==1)
		{
			CarLoan cl=new CarLoan();
			cl.getCarLoan();
		}
		else if(i==2)
		{
			HomeLoan hl=new HomeLoan();
			hl.getHomeLoan();
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}