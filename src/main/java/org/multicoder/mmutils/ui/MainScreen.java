package org.multicoder.mmutils.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainScreen extends JFrame implements ActionListener {
    public static final ImageIcon icon = new ImageIcon(Objects.requireNonNull(MainScreen.class.getResource("/images/icon.png")));

    public MainScreen() {
        super("Multicoder's Mod Management Utility");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setMaximumSize(new Dimension(800,600));
        setMinimumSize(new Dimension(800,600));
        setIconImage(icon.getImage());
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
