package Practical6;

import java.awt.*;
import javax.swing.*;

class Practical6Q2 extends JFrame{

    Practical6Q2(){
        JComboBox cb = new JComboBox<>();
        JFrame f = new JFrame("Combo box demo");
        cb.addItem("Barshi");
        cb.addItem("Mumbai");
        cb.addItem("Pune");
        cb.addItem("Solapur");
        f.add(cb);
        f.setVisible(true);
        f.setSize(600, 400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Practical6Q2();
    }
}