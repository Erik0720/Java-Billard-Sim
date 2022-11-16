package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Window window = new Window(500, 500);
        while(true) {
            window.repaint();
            Thread.sleep(10);
        }
    }

}
