package Practical7;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class Practical7Q1 extends JFrame{
    Practical7Q1(){
        JFrame f = new JFrame("Java Tree Demo");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setLayout(new FlowLayout());

        DefaultMutableTreeNode grandParent = new DefaultMutableTreeNode("Grand Parent");
        DefaultMutableTreeNode parent1 = new DefaultMutableTreeNode("Parent 1 ");
        DefaultMutableTreeNode parent2 = new DefaultMutableTreeNode("Parent 2");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("Child 3");
        DefaultMutableTreeNode child4 = new DefaultMutableTreeNode("Child 4");

        parent1.add(child1);
        parent1.add(child2);
        parent2.add(child3);
        parent2.add(child4);
        grandParent.add(parent1);
        grandParent.add(parent2);

        JTree jt = new JTree(grandParent);

        f.add(jt);
    }
    public static void main(String[] args) {
        new Practical7Q1();
    }
}