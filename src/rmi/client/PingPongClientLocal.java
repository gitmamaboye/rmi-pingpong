package rmi.client;
import rmi.server.PingPongInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class PingPongClientLocal {
   static void doPingPong(PingPongInterface ppi) throws RemoteException {
        ppi.ping();
        ppi.pong(10);

    }

    public static void main(String ...args) throws MalformedURLException, NotBoundException, RemoteException {
       PingPongInterface ppi = (PingPongInterface) Naming.lookup("rmi://192.168.0.223:1099/Pingpong");
        doPingPong(ppi);

    }
}
