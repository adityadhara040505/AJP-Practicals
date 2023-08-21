package Practical2;

import java.awt.*;

public class Practical2Q1 extends Frame{
    Practical2Q1(){
        setTitle("Applet viewer .AppChoice");
        setSize(600, 400);
        setVisible(true);
        setLayout(null);

        List l1 = new List();
        l1.add("Summer");
        l1.add("Winter");
        l1.add("Rainy Season");
        l1.setBounds(200, 50, 200, 50);

        add(l1);
    }
    public static void main(String[] args) {
        new Practical2Q1();
    }
}
