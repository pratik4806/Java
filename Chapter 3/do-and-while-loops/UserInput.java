import java.util.Scanner;

class UserInput
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Your name is : "+name);

		System.out.println("---------------------------------------");
		
		System.out.println("Enter your pin no");
		int pinno=s.nextInt();
		System.out.println("Your pin is : "+pinno);
	}
}