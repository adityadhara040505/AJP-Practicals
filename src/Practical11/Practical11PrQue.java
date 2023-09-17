package Practical11;

import java.awt.*;
import java.awt.event.*;

class Practical11PrQue extends Frame implements MouseListener, MouseMotionListener{
    
    Button btn = new Button("Click me");

    Label l = new Label("Mouse event happened", Label.RIGHT);

    Practical11PrQue(){
        setTitle("Mouse Events");
        setVisible(true);
        setSize(600,400);
        setLayout(null);

        l.setBounds(400, 350, 170, 30);
        btn.setBounds(200,150,200,100);
        btn.addMouseListener(this);
        btn.addMouseMotionListener(this);

        add(btn);
        add(l);

    }

    public void mousePressed(MouseEvent e){
        l.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent e){
        l.setText("Mouse exited");
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse clicked");
    }
    public void mouseMoved(MouseEvent e){
        l.setText("Mouse moved");
    }
    public void mouseDragged(MouseEvent e){
        l.setText("Mouse dragged");
    }

    public static void main(String[] args) {
        new Practical11PrQue();
    }
}
