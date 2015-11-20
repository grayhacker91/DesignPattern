package ProxyPattern.RMI;

import java.rmi.*;

public class RMIClient {
	static final String server = "127.0.0.1";

	public static void main(String[] args) {
		try {
			String host = 
					"rmi://" + server + "/DateServer";
			//get a proxy for the remote object
			RemoteDate ds = (RemoteDate)Naming.lookup(host);
			System.out.println(ds.getDate());
		} catch (Exception e) { }
	}  
}
