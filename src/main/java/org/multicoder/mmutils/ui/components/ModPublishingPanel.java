package org.multicoder.mmutils.ui.components;

import org.multicoder.mmutils.ui.MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModPublishingPanel extends JPanel implements ActionListener {
    public MainScreen mainScreen;

    public ModPublishingPanel(MainScreen mainScreen) {
        super();
        setSize(800,600);
        setLayout(null);
        setVisible(true);
        this.mainScreen = mainScreen;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mainScreen.actionPerformed(e);
    }
}
