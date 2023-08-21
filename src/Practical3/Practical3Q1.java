package Practical3;

import java.awt.*;

public class Practical3Q1 extends Frame{
    Practical3Q1(){
        Frame f = new Frame();
        GridLayout g = new GridLayout(5, 2);
        f.setTitle("Grid Demo");
        f.setLayout(g);
        f.setSize(600, 400);
        f.setVisible(true);

        Button b0 = new Button("Button 0");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        Button b6 = new Button("Button 6");
        Button b7 = new Button("Button 7");
        Button b8 = new Button("Button 8");
        Button b9 = new Button("Button 9");

        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
    }
    public static void main(String[] args) {
        new Practical3Q1();
    }
}
