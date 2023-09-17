package Practical12;

import javax.swing.*;
import java.awt.event.*;

class Practical12Q2 extends JFrame implements ActionListener{

    JButton submit = new JButton("Submit");
    JButton reset = new JButton("Reset");
    JLabel uName = new JLabel("Enter user name : ",JLabel.RIGHT);
    JLabel uPass = new JLabel("Enter password : ",JLabel.RIGHT);
    JLabel msg = new JLabel("",JLabel.CENTER);
    JTextField uNameTxt = new JTextField(40);
    JTextField uPassTxt = new JPasswordField(40);

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==submit){
            if(uNameTxt.getText()=="Aditya"){
                msg.setText(uNameTxt.getText()+"User authenticated");
            }else{
                msg.setText(uNameTxt.getText()+"User is not authenticated");
            }
        }
        if(ae.getSource()==reset){
            uNameTxt.setText("");
            uPassTxt.setText("");
        }

    }

    Practical12Q2(){

        setTitle("User Authentication");
        setVisible(true);
        setSize(600,400);
        setLayout(null);

        uName.setBounds(100,100,185,30);
        uPass.setBounds(100,150,185,30);
        uNameTxt.setBounds(315,100,185,30);
        uPassTxt.setBounds(315,150,185,30);
        submit.setBounds(200,230,85,30);
        reset.setBounds(315,230,85,30);
        msg.setBounds(100,300,400,30);

        submit.addActionListener(this);
        reset.addActionListener(this);

        add(msg);
        add(uName);
        add(uPass);
        add(uNameTxt);
        add(uPassTxt);
        add(submit);
        add(reset);

    }

    public static void main(String[] args){
        new Practical12Q2();
    }
}