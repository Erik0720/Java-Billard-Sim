package com.company;

import javax.swing.*;
import java.awt.*;

public class Ball extends JComponent {
    double speed;
    int rotation;
    int radius;
    double x;
    double y;


    Ball(int speed, int rotation, int radius, int x, int y) {
        this.speed = speed;
        this.rotation = rotation;
        this.radius = radius;
        this.x = x * 2;
        this.y = y * 2;
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        newPos(this.getRotation(), this.getSpeed(), this.getYAcc(), this.getXAcc());
        checkBorder();
        g.setColor(Color.WHITE);
        g.fillOval(getX(),getY(),radius*2,radius*2);
    }

    private void newPos(int rotation, double speed, double y, double x) {
        double distanceTravelled;
        distanceTravelled = speed*0.1;
        setY(Math.sin(rotation) * distanceTravelled + y);
        setX(Math.cos(rotation) * distanceTravelled + x);
    }

    public void checkBorder() {
        for(int i = 0; i < 360; i++) {
            int borderx = (int) Math.round(Math.sin(i) * getRadius() + getCenter()[0]);
            int bordery = (int) Math.round(Math.cos(i) * getRadius() + getCenter()[1]);
            //System.out.println("x: " + borderx + "  y: " + bordery);

            if(borderx <= 0 || borderx >= super.getWidth()) {
                setRotation(getRotation());
            } else if(bordery <= 0 || bordery >= super.getHeight()) {
                setRotation(getRotation());
            }
        }
    }

    public double getSpeed() {
        return speed;
    }

    public int getRotation() {
        return rotation;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getX() {
        return (int) x;
    }

    @Override
    public int getY() {
        return (int) y;
    }

    public double getXAcc() {
        return x;
    }

    public double getYAcc() {
        return y;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int[] getCenter() {
        int[] center = new int[2];
        center[0] = getX() + getRadius();
        center[1] = getY() - getRadius();
        return center;
    }
}
