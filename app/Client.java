package app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
  public static void main(String[] args) {

    String hostname = args[1];
    try {
      GameInterface gameInterface = (GameInterface) Naming.lookup("rmi://" + hostname + ":2001/MyGame");
      gameInterface.run();
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      throw new RuntimeException(e);
    }


  }
}
