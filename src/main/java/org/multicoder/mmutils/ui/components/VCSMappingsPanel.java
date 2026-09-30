package org.multicoder.mmutils.ui.components;

import org.multicoder.mmutils.ui.MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VCSMappingsPanel extends JPanel implements ActionListener {
    public MainScreen parent;

    public JTextField repositoryNameField = new JTextField();
    public JTextField repositoryURLField = new JTextField();
    public JTextField repositoryBranchesField = new JTextField();
    public JTable repositoriesTable = new JTable();
    public VCSMappingsPanel(MainScreen parent) {
        super();
        setSize(800,600);
        setLayout(null);
        setVisible(true);
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.actionPerformed(e);
    }
}
