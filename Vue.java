import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame {
    JPanel jpanel;

    CellListener cellListener;
    Grid grid;


    public Vue(Grid grid, CellListener cellListener){
        super("Tic-tac-toe");
        this.grid = grid;
        this.cellListener = cellListener;
        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(grid.size,grid.size));
        for (int i = 0; i < grid.size * grid.size ; i++) {
            CellButton b = new CellButton(grid.getCells().get(i));
            b.setBackground(Color.BLUE);
            b.addMouseListener(this.cellListener);

            jpanel.add(b);
        }




        setVisible(true);
        setSize(400,600);
        setResizable(true);

        this.setContentPane(jpanel);
    }

    public static void main(String[] args) {
        Vue vue = new Vue(new Grid(3),new CellListener());

    }

}
