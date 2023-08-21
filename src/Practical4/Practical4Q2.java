package Practical4;

import java.awt.*;
import javax.swing.*;

public class Practical4Q2 extends JFrame{

    Practical4Q2(){
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(grid);
        setTitle("Grid Layout Demo");
        setSize(600, 400);
        setVisible(true);

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        Label name = new Label("Name");
        Label comment = new Label("Comment");
        TextField tf1 = new TextField();
        TextArea ta1 = new TextArea(5, 40);
        Button b = new Button("Submit");

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(name,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(tf1,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(comment,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(ta1,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(b,gbc);
    }
    public static void main(String[] args) {
        new Practical4Q2();
    }
}
