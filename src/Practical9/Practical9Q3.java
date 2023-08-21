package Practical9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Practical9Q3 extends JFrame implements ActionListener{

    int progress = 0;
    JProgressBar pb = new JProgressBar(0, 100);
    JButton btn = new JButton("Increment Progress");
    JButton btn1 = new JButton("Decrement Progress");

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn){
            if(progress<=100){
                pb.setValue(progress+=10);
            }
        }
        else if(ae.getSource()==btn1){
            if(progress>=0){
                pb.setValue(progress-=10);
            }
        }
        else{
            System.out.println("Default program: "+ae.toString());
        }
    }

    Practical9Q3(){
        JFrame f = new JFrame("Controling Progress on button click");
        btn.addActionListener(this);
        btn1.addActionListener(this);

        f.add(pb);
        f.add(btn);
        f.add(btn1);
        f.setSize(600, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new Practical9Q3();
    }
}