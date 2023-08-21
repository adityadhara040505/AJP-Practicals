package Practical3;

import java.awt.*;

public class Practical3Q2 extends Frame{
    Practical3Q2(){
        Frame f = new Frame();
        GridLayout g = new GridLayout(3, 2, 20, 20);
        f.setTitle("Grid Layout Demo");
        f.setSize(600, 400);
        f.setLayout(g);
        f.setVisible(true);

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
    }
    public static void main(String[] args) {
        new Practical3Q2();
    }
}
