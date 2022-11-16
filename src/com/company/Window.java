package com.company;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame{
    int width;
    int height;
    JComponent[] components;

    Window(int width, int height) {
        this.width = width;
        this.height = height;

        this.setSize(width, height);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Board board = new Board(width, height);
        this.setContentPane(board);
    }

}
