package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
         displayBoard();
    }

    public static void displayBoard() {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(1000, 1000));
        frame.setLocationRelativeTo(null);

        Board board = new Board();
        frame.add(board);

        frame.setVisible(true);
    }
}