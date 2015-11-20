package ProxyPattern.RMI;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class RemoteDateImple extends UnicastRemoteObject implements RemoteDate{
	public RemoteDateImple() throws RemoteException { }
	  public Date getDate() throws RemoteException {
		  return new Date();
	  }
	  public static void main(String[] args) {
		try {
		  RemoteDate ds = new RemoteDateImple();
		  Naming.rebind("DateServer", ds);
		} catch (Exception e) { }
	  }
}
