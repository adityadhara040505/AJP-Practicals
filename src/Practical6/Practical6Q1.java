package Practical6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Practical6Q1 extends JFrame implements ActionListener{
    JComboBox cb = new JComboBox<>();
    Label l = new Label("                                                                     ");
     public void actionPerformed(ActionEvent e){
        l.setText("You are in "+ cb.getItemAt(cb.getSelectedIndex()));
    }
    Practical6Q1(){
        JFrame f = new JFrame("Combo Box Demo");
        cb.addItem("Solapur");
        cb.addItem("Pune");
        cb.addItem("Banglore");
        cb.addItem("Mumbai");
        f.add(cb);
        f.add(l);
        cb.addActionListener(this);
        f.setVisible(true);
        f.setSize(600, 400);
        f.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new Practical6Q1();
    }
}