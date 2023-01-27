import java.util.ArrayList;

public class Grid {
    ArrayList<Cell> cells;
    ArrayList<Player> players;
    int size;


    public Grid(int size){
        this.size = size;
        cells = new ArrayList<>();
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





}
