package org.multicoder.mmutils.ui.components;

import org.multicoder.mmutils.ui.MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModUpdatesPanel extends JPanel implements ActionListener {
    public MainScreen parent;

    public ModUpdatesPanel(MainScreen mainScreen) {
        super();
        setSize(800,600);
        setLayout(null);
        setVisible(true);
        this.parent = mainScreen;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        parent.actionPerformed(e);
    }
}
