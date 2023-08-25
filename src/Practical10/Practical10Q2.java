package Practical10;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
//import java.awt.Scrollbar;
//import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Practical10Q2 extends JFrame implements KeyListener{
    Label l = new Label("                                                                                        ");
    Label l1 = new Label("                                                                                        ");    
    TextField t  = new TextField();
    public void keyPressed(KeyEvent e){
        l.setText("Pressed Character : "+e.getKeyChar()+" Character code : "+e.getKeyCode()+"\n");
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){
        l1.setText("Typed Character : "+e.getKeyChar()+" Character code : "+e.getKeyCode()+"\n");
    }
    Practical10Q2(){
        setLayout(new FlowLayout());
        setSize(600, 400);
        setVisible(true);
        setTitle("Key event manager");
        t.addKeyListener(this);
        add(t);
        add(l);
        add(l1);
    }
    public static void main(String[] args) {
        new Practical10Q2();
    }
}
