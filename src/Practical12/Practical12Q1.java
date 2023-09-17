package Practical12;

import javax.swing.*;
class Practical12Q1 extends JFrame{
	JPasswordField passTxt = new JPasswordField("");
	Practical12Q1(){
		setLayout(null);
		passTxt.setBounds(200,150,200,30);
		passTxt.setEchoChar('#');
		add(passTxt);
	}
	public static void main(String[] args){
		Practical12Q1 p1 = new Practical12Q1();
		p1.setTitle("Practical 12 Q1");
		p1.setSize(600,400);
		p1.setVisible(true);
	}
}