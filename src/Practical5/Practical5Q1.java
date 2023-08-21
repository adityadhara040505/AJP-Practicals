package Practical5;

import java.awt.*;
import javax.swing.*;

class Practical5Q1 extends JFrame{

    Practical5Q1(){
        JMenuBar mb = new JMenuBar();
        JMenu mainMenu = new JMenu("Colours");
        JMenuItem black = new JMenuItem("Black");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem yellow = new JMenuItem("Yellow");
        JMenuItem red = new JMenuItem("Red");
        JFrame f = new JFrame("Manu Bar Demo");

        mainMenu.add(black);
        mainMenu.add(red);
        mainMenu.add(blue);
        mainMenu.add(yellow);
        black.setEnabled(false);

        mb.add(mainMenu);

        f.add(mb);

        f.setSize(600, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new Practical5Q1();
    }
}