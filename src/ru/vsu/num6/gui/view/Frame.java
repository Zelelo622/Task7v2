package ru.vsu.num6.gui.view;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        Panel panel = new Panel();
        this.add(panel);
        this.setTitle("Task7");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setBounds(300, 150, 450, 450);
    }
}
