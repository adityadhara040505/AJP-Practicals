package Practical7;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class Practical7Q3 extends JFrame{

    Practical7Q3(){
        JFrame f = new JFrame();
        f.setSize(600, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        DefaultMutableTreeNode thisPc       = new DefaultMutableTreeNode("This PC");
        DefaultMutableTreeNode obj          = new DefaultMutableTreeNode("3D Objects");
        DefaultMutableTreeNode desktop      = new DefaultMutableTreeNode("Desktop");
        DefaultMutableTreeNode documents    = new DefaultMutableTreeNode("Documents");
        DefaultMutableTreeNode downloads    = new DefaultMutableTreeNode("Downloads");
        DefaultMutableTreeNode music        = new DefaultMutableTreeNode("Music");
        DefaultMutableTreeNode pictures     = new DefaultMutableTreeNode("Pictures");
        DefaultMutableTreeNode videos       = new DefaultMutableTreeNode("Videos");

        thisPc.add(obj);
        thisPc.add(desktop);
        thisPc.add(documents);
        thisPc.add(downloads);
        thisPc.add(music);
        thisPc.add(pictures);
        thisPc.add(videos);

        JTree jt = new JTree(thisPc);

        f.add(jt);
    }
    public static void main(String[] args) {
        new Practical7Q3();
    }
}