package Practical11;

import java.awt.*;
import java.awt.event.*;

class Practical11Q2 extends Frame implements MouseListener{
	
	Label title = new Label("Mouse click counter",Label.CENTER);
	Label counter = new Label("       ",Label.RIGHT);
	
	Practical11Q2(){
		
		setLayout(null);
		title.setBounds(100,50,400,80);
		counter.setBounds(470,350,100,30);
		
		this.addMouseListener(this);
		
		add(title);
		add(counter);
		
	}
	
	public void mousePressed(MouseEvent me){
		
		counter.setText("Mouse clicks : "+me.getClickCount());
		
	}
	
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	
	public static void main(String[] args){
		
		Practical11Q2 p1 = new Practical11Q2();
		p1.setTitle("Mouse click counter");
		p1.setVisible(true);
		p1.setSize(600,400);
		
	}
	
}