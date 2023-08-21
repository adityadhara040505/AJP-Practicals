package Practical1;

import java.awt.*;

class Practical1Q1 extends Frame{
    Practical1Q1(){
        setTitle("Practical 1");
        setLayout(null);
        setSize(600, 400);

        Label l1 = new Label("Welcome to Java");
        l1.setBounds(280, 200, 100, 20);
        add(l1);

        setVisible(true);
    }
    public static void main(String[] args){
        new Practical1Q1();
    }
}