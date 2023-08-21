package Practical1;
import java.awt.*;

public class Practical1Q3 extends Frame{
    Practical1Q3(){

        setTitle("Practical 1 Q. 3");
        setLayout(null);
        setVisible(true);
        setSize(600, 400);

        Button b1 = new Button("OK");
        Button b2 = new Button("RESET");
        Button b3 = new Button("CANCLE");

        b1.setBounds(100, 50, 100, 20);
        b2.setBounds(100, 150, 100, 20);
        b3.setBounds(100, 250, 100, 20);

        add(b1);
        add(b2);
        add(b3);
    }
    public static void main(String[] args) {
        new Practical1Q3();
    }
}
