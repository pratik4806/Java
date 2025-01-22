import java.rmi.Naming;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			AddImplClass obj=new AddImplClass();
			Naming.rebind("aaa", obj);
			System.out.println("Server started");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}