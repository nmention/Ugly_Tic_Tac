import javax.swing.*;

public class Cell {

    static String imgPath;

    boolean marked;
    static ImageIcon img;


    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public Cell(){
        marked = false;
    }






}
