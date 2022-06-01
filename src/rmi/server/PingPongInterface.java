package rmi.server;

public interface PingPongInterface extends java.rmi.Remote {
    public void ping() throws java.rmi.RemoteException;
    public long pong(long i) throws java.rmi.RemoteException;
}
