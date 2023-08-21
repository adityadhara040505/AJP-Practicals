package Practical8;

import javax.swing.*;

class Practical8Q2 extends JFrame{

    Practical8Q2(){
        JFrame f = new JFrame("Table demo");

        String[][] data = {
            {"101","Amit","87,000"},
            {"102","Jai","78,000"},
            {"103","Sachin","70,000"}
        };
        String[] column = {"ID","NAME","SALARY"};

        JTable t = new JTable(data, column);

        JScrollPane jsp = new JScrollPane(t);

        f.add(jsp);
        f.setSize(600,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args) {
        new Practical8Q2();
    }
}