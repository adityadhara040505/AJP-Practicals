package Practical5;

import java.awt.*;
import java.awt.event.*;

class MenuDemo1 extends Frame{

    MenuBar mb;
    MenuItem m1,m2,m3,m4;
    Menu mn;
    MenuShortcut ms;
    MenuDemo1(){
        setTitle("Menu Bar Demo");
        setSize(600, 400);

        ms = new MenuShortcut(KeyEvent.VK_X);
        mn = new Menu("File");
        m1 = new MenuItem("New...");
        m2 = new MenuItem("Open...");
        m3 = new MenuItem("Save as...");
        m4 = new MenuItem("Exit",ms);

        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        mn.add(m4);

        mb.add(mn);
        setMenuBar(mb);
    }
    public static void main(String[] args) {
        MenuDemo1 md = new MenuDemo1();
        md.setVisible(true);
    }
}