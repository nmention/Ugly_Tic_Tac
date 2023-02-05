package controller;

import model.Grid;
import vue.CellButton;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CellListener implements MouseListener {

    Grid grid;


    public CellListener(Grid grid){
        super();
        this.grid = grid;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        CellButton button = (CellButton) e.getSource();
        button.getCell().setMarked(grid.getPlayers().get(0).getSign());

        System.out.println(button.getCell());
        button.setIcon(grid.getPlayers().get(0).getSignMarked());
        button.setDisabledIcon(grid.getPlayers().get(0).getSignMarked());
        button.setEnabled(false);






    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
