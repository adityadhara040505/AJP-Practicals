package Practical10;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class Practical10Q1 extends JFrame implements KeyListener{

    JLabel l = new JLabel("                             ");

    Practical10Q1(){
        JFrame f = new JFrame("Key event listening");
        f.setSize(600, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        JTextArea tArea = new JTextArea("Enter text");
        tArea.addKeyListener(this);
        f.add(tArea);
        f.add(l);
    }
    public static void main(String[] args) {
        new Practical10Q1();
    }
    
    public void keyTyped(KeyEvent e) {
        
    }
    
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }
    
    public void keyReleased(KeyEvent e) {
        
    }
}