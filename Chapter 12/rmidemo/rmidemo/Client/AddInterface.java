import java.rmi.*;
public interface AddInterface extends Remote
{
	public int add(int no1, int no2) throws RemoteException;
}