package Practical2;

import java.awt.*;

public class Practical2Q3 extends Frame{
    Practical2Q3(){
        setTitle("Practical 2 Q. 3");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);

        List l1 = new List();
        l1.add("Sakal");
        l1.add("Lok Satta");
        l1.add("Nav Bharat Times");
        l1.add("Times of India");
        l1.setBounds(200,200,150,20);
        add(l1);

    }
    public static void main(String[] args) {
        new Practical2Q3();
    }
}
