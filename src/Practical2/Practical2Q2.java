package Practical2;

import java.awt.*;

public class Practical2Q2 extends Frame{
    Practical2Q2(){
        setTitle("Practical 2 Q. 2");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);

        List l1 = new List();
        l1.add("Barshi");
        l1.add("Mumbai");
        l1.add("Delhi");
        l1.add("Pune");
        l1.add("Nashik");
        l1.add("Nagpur");
        l1.add("Ratnagiri");
        l1.add("Kolhapur");
        l1.add("Hydrabad");
        l1.add("Chennai");
        l1.setBounds(200, 100, 200, 20);

        add(l1);
    }
    public static void main(String[] args) {
        new Practical2Q2();
    }
}
