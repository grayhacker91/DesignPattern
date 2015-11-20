package ProxyPattern.RMI;

import java.rmi.*;
import java.util.*;

public interface RemoteDate extends Remote{
	public Date getDate() throws RemoteException;
}
