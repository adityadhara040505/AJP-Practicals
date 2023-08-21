package Practical3;

import java.awt.*;

public class Practical3Q3 extends Frame{
    Practical3Q3(){
        BorderLayout br = new BorderLayout();
        Frame f = new Frame();
        f.setTitle("Border Layout Demo");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setLayout(br);

        Button c = new Button("Center");
        Button n = new Button("North");
        Button s = new Button("South");
        Button e = new Button("East");
        Button w = new Button("West");
        
        f.add(c,BorderLayout.CENTER);
        f.add(n, BorderLayout.NORTH);
        f.add(s, BorderLayout.SOUTH);
        f.add(e, BorderLayout.EAST);
        f.add(w, BorderLayout.WEST);
    }
    public static void main(String[] args) {
        new Practical3Q3();
    }
}