package rmi.client;
import rmi.server.PingPongInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PingPongClientRemote  extends UnicastRemoteObject {
    protected PingPongClientRemote() throws RemoteException {}
    static void doPingPong(PingPongInterface ppi) throws RemoteException {
        ppi.ping();
        ppi.pong(10);
    }
}
