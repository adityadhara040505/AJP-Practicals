package Practical11;

import java.awt.*;
import java.awt.event.*;

class Practical11Q1 extends Frame implements MouseListener{
	
	int i=1;
	
	Practical11Q1(){
		
		addMouseListener(this);
		setLayout(new GridBagLayout());
		add(new Label("Click on the screen"));
		
	}
	
	public void mouseClicked(MouseEvent me){
		
		switch(i)
		{
			
			case 1: this.setBackground(Color.RED);i++;break;
			case 2: this.setBackground(Color.YELLOW);i++;break;
			case 3: this.setBackground(Color.BLUE);i=1;break;
			
		}
		
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
	public static void main(String[] args){
		
		Practical11Q1 p1 = new Practical11Q1();
		p1.setTitle("Practical 11 Q1");
		p1.setVisible(true);
		p1.setSize(600,400);
		
	}
	
}
