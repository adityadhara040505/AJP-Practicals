package Practical6;

import javax.swing.*;
import java.awt.*;

class Practical6Q3 extends JFrame {

    Practical6Q3(){
        JFrame f = new JFrame("Scroll pane demo");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JTextArea tArea = new JTextArea("Hello Java developer", 10, 10);
        JScrollPane sp = new JScrollPane(tArea);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        f.add(sp);
    }
    public static void main(String[] args) {
        new Practical6Q3();
    }
}