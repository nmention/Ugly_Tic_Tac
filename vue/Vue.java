package vue;

import controller.CellListener;
import model.Grid;

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
        jpanel.setLayout(new GridLayout(grid.getSize(),grid.getSize()));
        for (int i = 0; i < grid.getSize() * grid.getSize() ; i++) {
            CellButton b = new CellButton(grid.getCells().get(i));
            b.setBackground(Color.BLUE);
            b.addMouseListener(this.cellListener);

            jpanel.add(b);
        }




        setVisible(true);

        setSize(500,650);

        setLocationRelativeTo(null);
        setResizable(true);

        this.setContentPane(jpanel);
    }


    public void winningFrame(){

    }


    public void gameOverFrame(){

    }




    public static void main(String[] args) {
        Grid grid = new Grid(3);
        Vue vue = new Vue(grid,new CellListener(grid));

    }

}
