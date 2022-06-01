package rmi.server;

public interface RMIInterface extends java.rmi.Remote{
     //void ping() throws java.rmi.RemoteException;
     void sayMyName (String name) throws java.rmi.RemoteException;
}
