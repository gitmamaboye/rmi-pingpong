package rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static  void main(String ...args) throws RemoteException {
        RMIInterfaceImp s = new RMIInterfaceImp();
        try {
            LocateRegistry.createRegistry(1098);
            Naming.rebind("rmi://localhost:1098/RMI", s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
