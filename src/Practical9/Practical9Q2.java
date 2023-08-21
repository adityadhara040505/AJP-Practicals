package Practical9;

import javax.swing.*;

class Practical9Q2 extends JFrame{

    Practical9Q2(){
        JProgressBar pb = new JProgressBar(0, 100);
        JFrame f = new JFrame("Progress bar demo");
        f.setLayout(null);
        f.setSize(600,400);
        f.setVisible(true);

        f.add(pb);
        pb.setBounds(200, 100, 10, 100);
        pb.setOrientation(JProgressBar.VERTICAL);
        pb.setValue(50);
    }
    public static void main(String[] args) {
        new Practical9Q2();
    }
}