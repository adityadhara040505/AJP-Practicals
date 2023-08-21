package Practical8;

import java.awt.*;
import javax.swing.*;

public class Practical8Q1 extends JFrame{

    Practical8Q1(){
        JFrame f = new JFrame("Table Demo");
        String[][] data = {
            {"1","Aditya","98"},
            {"2","Aditi","100"},
            {"3","Anuj","97"},
            {"4","Avi","98"}
        };
        String[] columns = {"Roll no.", "Name", "Marks"};

        JTable t = new JTable(data, columns);
        JScrollPane jsp = new JScrollPane(t);

        f.add(jsp);
        f.setVisible(true);
        f.setSize(600, 400);
        f.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new Practical8Q1();
    }
}
