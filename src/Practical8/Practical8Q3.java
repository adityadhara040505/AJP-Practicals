package Practical8;

import javax.swing.*;

class Practical8Q3 extends JFrame{

    Practical8Q3(){
        JFrame f = new JFrame("Table demo");

        String[][] data = {
            {"Aditya","98.4","A++"},
            {"Ram","97","A++"},
            {"Nilesh","94","A+"},
            {"Kaustubh","90","A+"},
            {"Channa","95","A++"},
            {"Shardul","94","A+"},
            {"Shripad","93","A+"},
            {"Shriyash","91","A+"},
            {"Abhi","95","A++"},
            {"Aditi","100","A+++"}
        };
        String[] column = {"Name","Percentage","Grade"};

        JTable t = new JTable(data, column);

        JScrollPane jsp = new JScrollPane(t);

        f.add(jsp);
        f.setSize(600,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args) {
        new Practical8Q3();
    }
}