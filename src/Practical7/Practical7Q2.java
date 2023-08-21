package Practical7;

import java.awt.*;
import javax.swing.JTree;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;

public class Practical7Q2 extends JFrame{

    Practical7Q2(){
        JFrame f = new JFrame("StatesInIndia");
        f.setSize(600,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        DefaultMutableTreeNode India = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode maharashtra = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode mumbai = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode pune = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode nashik = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode nagpur = new DefaultMutableTreeNode("Nagpur");
        DefaultMutableTreeNode gujarath = new DefaultMutableTreeNode("Gujarath");

        maharashtra.add(mumbai);
        maharashtra.add(pune);
        maharashtra.add(nagpur);
        maharashtra.add(nashik);

        India.add(maharashtra);
        India.add(gujarath);

        JTree state = new JTree(India);

        f.add(state);
    }
    public static void main(String[] args) {
        new Practical7Q2();
    }
}
