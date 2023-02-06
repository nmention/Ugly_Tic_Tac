package model;

import model.Player;

import java.util.ArrayList;

public class Grid {
    ArrayList<Cell> cells;
    ArrayList<Player> players;
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Grid(int size){
        this.size = size;
        cells = new ArrayList<>();
        players = new ArrayList<>();


        players.add(new Player("Jacques",Sign.CROSS));
        players.add(new Player("Pierre",Sign.CIRCLE));
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                cells.add(new Cell());
            }
        }
    }


    public ArrayList<Cell> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }

    public ArrayList<Cell> getColumn(int nb){
        ArrayList<Cell> column = new ArrayList<>();
        for (int i = 0; i < size * size ; i+=size) {
            column.add(this.getCells().get(i));
        }
        return column;
    }


    public ArrayList<Cell> getLine(int nb){
        ArrayList<Cell> line = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            line.add(this.getCells().get(i));
        }
        return line;
    }

    public ArrayList<Cell> getDiagonals(int nb){
        ArrayList<Cell> diagonals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            diagonals.add(this.getCells().get(i));
        }
        return diagonals;
    }

    public void addPlayers(Player player){
      players.add(player);
    }





}
