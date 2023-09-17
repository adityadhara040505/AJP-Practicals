package Practical11;

import java.awt.*;
import java.awt.event.*;

class Practical11Q3 extends Frame implements MouseMotionListener{
	
	Button b = new Button("Button");
	Label l = new Label("                        ",Label.CENTER);
	
	Practical11Q3(){
		
		setLayout(null);
		b.addMouseMotionListener(this);
		b.setBounds(250,150,100,100);
		l.setBounds(400,300,200,30);
		add(b);
		add(l);
	}
	
	public void mouseDragged(MouseEvent me){
	    l.setText("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent me){
		l.setText("Mouse Moved");
	}
	
	public static void main(String[] args){
		
		Practical11Q3 pr = new Practical11Q3();
		pr.setTitle("Practical 11 Q 3");
		pr.setVisible(true);
		pr.setSize(600,400);
		
	}
	
}