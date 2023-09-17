package Practical12;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

class Practical12Q4 extends JFrame implements ActionListener{

    JLabel title = new JLabel("Sign In",JLabel.CENTER);
    JLabel uName = new JLabel("Enter user name : ",JLabel.RIGHT);
    JLabel uPass = new JLabel("Enter password : ",JLabel.RIGHT);
    JLabel msg   = new JLabel("",JLabel.CENTER);

    JTextField uNameTxt     = new JTextField();
    JPasswordField uPassTxt = new JPasswordField();

    JButton submit = new JButton("Submit");
    
    public void actionPerformed(ActionEvent ae){
        if((uPassTxt.getPassword()).length<6){
            msg.setText("Password length must be > 6 characters");
        }
    }

    Practical12Q4(){
        setTitle("Practical 12 Q4");
        setVisible(true);
        setSize(600,400);
        setLayout(null);
        
        title.setFont(new Font("Times new roman",Font.BOLD,25));

        title.setBounds(100,100,400,30);
        uName.setBounds(50,150,200,30);
        uPass.setBounds(50,200,200,30);
        uNameTxt.setBounds(280,150,200,30);
        uPassTxt.setBounds(280,200,200,30);
        submit.setBounds(250,250,100,30);
        msg.setBounds(100,300,400,30);

        submit.addActionListener(this);

        add(title);
        add(uName);
        add(uPass);
        add(uNameTxt);
        add(uPassTxt);
        add(submit);
        add(msg);

    }
    public static void main(String[] args){
        new Practical12Q4();
    }

}
