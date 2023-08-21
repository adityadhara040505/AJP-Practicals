package Practical1;
import java.awt.*;
public class Practical1Q2 extends Frame{
    Practical1Q2(){

        setVisible(true);
        setSize(600, 400);
        setTitle("Practical 1 Q. 2");
        setLayout(new FlowLayout());

        Checkbox ch1 = new Checkbox("Marathi");
        Checkbox ch2 = new Checkbox("Hindi");
        Checkbox ch3 = new Checkbox("English");
        Checkbox ch4 = new Checkbox("Sanskrit");

        ch1.setBounds(100, 50, 50, 20);
        ch1.setBounds(100, 100, 50, 20);
        ch1.setBounds(300, 50, 50, 20);
        ch1.setBounds(300, 100, 50, 20);

        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);
    }
    public static void main(String[] args) {
        new Practical1Q2();
    }
}
