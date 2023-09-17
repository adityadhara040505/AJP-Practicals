package Practical12;

import javax.swing.*;
import java.awt.event.*;

class Practical12Q3 extends JFrame implements ActionListener{
    
    JLabel title = new JLabel("Simple Adder",JLabel.CENTER);
	JLabel fno   = new JLabel("Enter first number : ",JLabel.RIGHT);
	JLabel sno   = new JLabel("Enter second number : ",JLabel.RIGHT);
	JLabel result= new JLabel("",JLabel.CENTER);
	
	JTextField fnoTxt = new JTextField();
	JTextField snoTxt = new JTextField();
	
	JButton add = new JButton("ADD");

    public void actionPerformed(ActionEvent ae){
        result.setText("Result : "+(Double.parseDouble(fnoTxt.getText())+Double.parseDouble(snoTxt.getText())));
    }

    Practical12Q3(){
        setLayout(null);
        setTitle("Adder");
        setVisible(true);
        setSize(600,400);

        title.setBounds(100,50,400,50);
		fno.setBounds(100,150,200,30);
		sno.setBounds(100,200,200,30);
		result.setBounds(100,250,400,30);

        fnoTxt.setBounds(330,150,200,30);
		snoTxt.setBounds(330,200,200,30);
		
		add.setBounds(250,300,90,30);

        add.addActionListener(this);

        add(title);
		add(fno);
		add(sno);
		add(result);
		add(fnoTxt);
		add(snoTxt);
        add(add);
        add(result);
    }

    public static void main(String[] args){
        new Practical12Q3();
    }

}
