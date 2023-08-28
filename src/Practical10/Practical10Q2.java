package Practical10;

import java.awt.*;
import java.awt.event.*;

class Practical10Q1 extends Frame implements KeyListener{

	Label title              = new Label("Key Event for special characters",Label.CENTER);
	TextField input          = new TextField("Enter Some Text");
	Label checkForSpecialKey = new Label("                                                      ",Label.CENTER);

	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){
		int key = ke.getKeyCode();
		
		switch(key){
		    case KeyEvent.VK_RIGHT : checkForSpecialKey.setText("right arrow is pressed"); break;
			case KeyEvent.VK_LEFT : checkForSpecialKey.setText("left arrow is pressed"); break;
			case KeyEvent.VK_UP : checkForSpecialKey.setText("Up arrow is pressed"); break;
			case KeyEvent.VK_DOWN : checkForSpecialKey.setText("down arrow is pressed"); break;
			case KeyEvent.VK_F1 : checkForSpecialKey.setText("Function 1 is pressed"); break;
			case KeyEvent.VK_F2 : checkForSpecialKey.setText("Function 2 is pressed"); break;
			case KeyEvent.VK_F3 : checkForSpecialKey.setText("Function 3 is pressed"); break;
			case KeyEvent.VK_F4 : checkForSpecialKey.setText("Function 4 is pressed"); break;
			case KeyEvent.VK_F5 : checkForSpecialKey.setText("Function 5 is pressed"); break;
			case KeyEvent.VK_F6 : checkForSpecialKey.setText("Function 6 is pressed"); break;
			case KeyEvent.VK_F7 : checkForSpecialKey.setText("Function 7 is pressed"); break;
			case KeyEvent.VK_F8 : checkForSpecialKey.setText("Function 8 is pressed"); break;
			case KeyEvent.VK_F9 : checkForSpecialKey.setText("Function 9 is pressed"); break;
			case KeyEvent.VK_F10 : checkForSpecialKey.setText("Function 10 is pressed"); break;
			case KeyEvent.VK_F11 : checkForSpecialKey.setText("Function 11 is pressed"); break;
			case KeyEvent.VK_F12 : checkForSpecialKey.setText("Function 12 is pressed"); break;
			default : checkForSpecialKey.setText("Other characters are pressed character : "+ke.getKeyChar()+" Char code : "+ke.getKeyCode());
		}
	}
	public void keyTyped(KeyEvent ke){
		
		
		
	}
	
	Practical10Q1(){
		
		setLayout(null);
		
		title.setFont(new Font("Times new roman",Font.BOLD|Font.ITALIC,25));
		
		title.setBounds(100,100,400,100);
		input.setBounds(100,200,400,30);
		checkForSpecialKey.setBounds(100,250,400,30);
		
		input.addKeyListener(this);
		
		add(title);
		add(input);
		add(checkForSpecialKey);
		
	}
	
	public static void main(String[] args){
		
		Practical10Q1 keyDemo = new Practical10Q1();
		keyDemo.setTitle("Key event listener for special characters");
		keyDemo.setSize(600,400);
		keyDemo.setVisible(true);
		
	}
	
}
