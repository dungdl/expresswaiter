package com.view.ui.frame;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;

public class PanelTable extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTable() {
		setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		setLayout(new GridLayout(1, 0, 0, 0));

	}

}
