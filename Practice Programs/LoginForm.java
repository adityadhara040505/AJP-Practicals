package bin;

import java.awt.*;
import java.awt.event.*;

class LoginFormDemo extends Frame{
	
	Font titleFont     = new Font("Times new roman",Font.BOLD|Font.ITALIC,35);
	Font otherTextFont = new Font("Times new roman",Font.BOLD,20);
	
	Color bgColor = new Color(152,255,129);
	Color txtColor = new Color(78,78,78);
	Color titleColor = new Color(29,159,0);
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	Label title = new Label("Login Form",Label.CENTER);
	Label uName = new Label("Enter user name :",Label.RIGHT);
	Label pass  = new Label("Enter password :",Label.RIGHT);
	
	TextField uNameTxt = new TextField(20);
	TextField passTxt  = new TextField(20);
	
	Button submit = new Button("Login");
	
	LoginFormDemo(){
		setLayout(new GridBagLayout());
		title.setFont(titleFont);
		setFont(otherTextFont);
		title.setForeground(titleColor);
		setBackground(bgColor);
		setForeground(txtColor);
		submit.setForeground(titleColor);
		
		passTxt.setEchoChar('*');
		
		gbc.insets = new Insets(50,50,50,50);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		add(title,gbc);
		
		gbc.insets = new Insets(0,0,20,0);//TOP LEFT BOTTOM RIGHT
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		add(uName,gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		add(uNameTxt,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		add(pass,gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		add(passTxt,gbc);
		
		gbc.insets = new Insets(10,10,10,10);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 4;
		add(submit,gbc);
	}
	
	public static void main(String[] args){
		LoginFormDemo form = new LoginFormDemo();
		form.setTitle("Login Form");
		form.setVisible(true);
		form.setSize(1200,600);
	}
}