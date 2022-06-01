package rmi.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIInterfaceImp extends UnicastRemoteObject implements RMIInterface {
    public RMIInterfaceImp() throws RemoteException {
        super();
    }
    @Override
    public void sayMyName(String name) throws RemoteException {
         System.out.println("Your Name is: "+name);

    }
    }

