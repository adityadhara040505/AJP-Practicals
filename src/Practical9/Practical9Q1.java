package Practical9;

import java.awt.*;
import javax.swing.*;

class Practical9Q1 extends JFrame{

    Practical9Q1(){
        JFrame f = new JFrame("Progress bar demo");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JProgressBar pb = new JProgressBar(0, 100);
        pb.setValue(90);
        pb.setForeground(Color.GREEN);
        pb.setString(pb.getValue()+"%");
        pb.setStringPainted(true);
        if(pb.isStringPainted()){
            System.out.println("String is painted");
        }
        else{
            System.out.println("String is not painted");
        }
        f.add(pb);
    }
    public static void main(String[] args) {
        new Practical9Q1();
    }
}