package Practical10;

import java.awt.*;
import java.awt.event.*;

class Practical10Q3 extends Frame implements ActionListener{
	
	Label title = new Label("Multiplier",Label.CENTER);
	Label result = new Label("                          ",Label.CENTER);
	TextField fno = new TextField();
	TextField sno = new TextField();
	Button mul = new Button("Multiply");
	
	public void actionPerformed(ActionEvent ae){
		
		int a = Integer.parseInt(fno.getText());
		int b = Integer.parseInt(sno.getText());
		int c = a * b;
		result.setText("Multiplication of "+a+" and "+b+" is : "+c);
		
	}
	
	Practical10Q3(){
		
		setLayout(null);
		
		title.setBounds(100,100,400,50);
		fno.setBounds(100,200,200,30);
		sno.setBounds(330,200,200,30);
		result.setBounds(100,250,400,30);
		mul.setBounds(250,300,100,30);
		
		mul.addActionListener(this);
		
		add(title);
		add(fno);
		add(sno);
		add(result);
		add(mul);
		
	}
	
	public static void main(String[] args){
		
		Practical10Q3 f = new  Practical10Q3();
		f.setTitle("Key Demo");
		f.setVisible(true);
		f.setSize(600,400);
		
	}
	
}