package app;

import controller.CellListener;
import model.Grid;
import model.Player;
import model.Sign;
import vue.Vue;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

    public static void main(String[] args) {

      Grid grid = new Grid(3);
      Player p1 = new Player("Jacques", Sign.CROSS);
      Player p2 = new Player("Jean", Sign.CIRCLE);














      grid.addPlayers(p1);
      Vue vue = new Vue(grid, new CellListener(grid));

      try {
        Game game = new Game(vue);
        Naming.rebind("rmi://ic2s120-16.univ-lemans.fr:2001/MyGame", game);
      } catch (RemoteException e) {
        throw new RuntimeException(e);
      } catch (MalformedURLException e) {
        throw new RuntimeException(e);
      }


    }
}
