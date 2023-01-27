import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame {
    JPanel jpanel;
    Grid grid;


    public Vue(Grid grid){
        super("Tic-tac-toe");
        this.grid = grid;
        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(grid.size,grid.size));
        for (int i = 0; i < grid.size * grid.size ; i++) {
            JButton b = new JButton();
            b.setBackground(Color.BLUE);
            jpanel.add(b);
        }



        setVisible(true);
        setSize(400,600);
        setResizable(true);

        this.setContentPane(jpanel);
    }

    public static void main(String[] args) {
        Vue vue = new Vue(new Grid(3));
    }

}
