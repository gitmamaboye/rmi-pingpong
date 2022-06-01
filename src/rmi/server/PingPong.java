package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PingPong  extends UnicastRemoteObject implements PingPongInterface{
    public PingPong() throws RemoteException {
    }

    @Override
    public void ping() throws RemoteException {
        System.out.println("Ping");
    }

    @Override
    public long pong(long i) throws RemoteException {
        System.out.println("Pong: "+i);
        return i;
    }
}
