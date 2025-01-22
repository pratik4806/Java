import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Registry registry=LocateRegistry.getRegistry("192.168.29.175", 1111);
			AddInterface ai=(AddInterface) Naming.lookup("aaa");
			System.out.println(ai.add(100, 200));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}