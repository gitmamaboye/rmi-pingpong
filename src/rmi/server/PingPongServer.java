package rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;


public class PingPongServer {
    public static void main(String ...args) throws RemoteException, MalformedURLException {
        System.setProperty("java.security.policy","file:///tmp/test.policy");
        PingPong PINGPONG = new PingPong();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("Pingpong", PINGPONG);

    }
}
