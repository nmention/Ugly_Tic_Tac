package app;

import controller.CellListener;
import model.Grid;
import model.Player;
import model.Sign;
import vue.Vue;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
  String hostname;
  Vue vue;

  Game game;




    public Server() throws RemoteException {
       hostname = "";

      try {
        hostname = InetAddress.getLocalHost().getHostName();
      } catch (UnknownHostException e) {
        throw new RuntimeException(e);
      }

      Grid grid = new Grid(3);
      Player p1 = new Player("Jacques", Sign.CROSS);
      Player p2 = new Player("Jean", Sign.CIRCLE);

      grid.addPlayers(p1);
      Vue vue = new Vue(grid, new CellListener(grid));
      game = new Game(vue);



    }
    public void run(){
      try {
        Naming.rebind("rmi://" + hostname + ":2001/MyGame", game);
      } catch (RemoteException | MalformedURLException e) {
        throw new RuntimeException(e);
      }
      System.out.println("------");
      System.out.println("Game shared in rmiregistry");
      System.out.println("------");

    }

  public static void main(String[] args) {
      Server server = null;
    try {
      server = new Server();
    } catch (RemoteException e) {
      throw new RuntimeException(e);
    }
    server.run();
  }
}
