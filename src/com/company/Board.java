package com.company;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    int width;
    int height;
    int rotation = 120;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        Ball ball = new Ball(8, rotation, 10, 10, 10);
        this.setLayout(new GridLayout());
        this.add(ball);
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.decode("#2c8257"));
        g.fillRect(0, 0, width, height);
    }
}
