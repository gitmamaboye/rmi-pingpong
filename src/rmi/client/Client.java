package rmi.client;

import rmi.server.RMIInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Client {
    public static  void main(String ...args) throws RemoteException, NotBoundException, MalformedURLException {
        RMIInterface rmi = (RMIInterface) Naming.lookup("rmi://localhost:1098/RMI");
        rmi.sayMyName("Mama");
    }
}
