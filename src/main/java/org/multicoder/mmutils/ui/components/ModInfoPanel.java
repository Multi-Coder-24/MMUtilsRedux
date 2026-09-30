package org.multicoder.mmutils.ui.components;

import org.multicoder.mmutils.ui.MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModInfoPanel extends JPanel implements ActionListener {
    public MainScreen mainScreen;

    public JTextField modNameField = new JTextField();
    public JTextField modAuthorField = new JTextField();
    public JTextField modVersionField = new JTextField();
    public JTextArea modDescriptionField = new JTextArea();
    public JTextField modLoadersField = new JTextField();
    public JTextField modGameVersionsField = new JTextField();

    public ModInfoPanel(MainScreen parent) {
        super();
        setSize(800,600);
        setLayout(null);
        setVisible(true);
        mainScreen = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainScreen.actionPerformed(e);
    }
}
