package com.view.ui.panel;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class PanelInfo extends JPanel {

	// MARK:- Components
	private JPanel pnEmpty;
	private JLabel lblEmpty;
	private JLabel lblNumFree;
	private JPanel pnBusy;
	private JLabel lblBusy;
	private JLabel lblNumBusy;
	private JPanel pnRepair;
	private JLabel lblRepair;
	private JLabel lblNumRepair;

	private int free;
	private int busy;

	/**
	 * Create the panel.
	 */
	public PanelInfo(int free, int busy) {

		this.free = free;
		this.busy = busy;

		setBorder(new LineBorder(SystemColor.activeCaptionBorder));

		addFreeTableProperties();
		addBusyTableProperties();
		addRepairTableProperties();
		
		

	}

	// Separate code for easily understand

	// ACTION: as the name of function below
	private void addFreeTableProperties() {
		pnEmpty = new JPanel();
		pnEmpty.setBounds(11, 12, 186, 42);
		pnEmpty.setBorder(new LineBorder(SystemColor.scrollbar));
		pnEmpty.setBackground(new Color(102, 204, 102));

		lblEmpty = new JLabel("Tr\u1ED1ng");
		lblEmpty.setBounds(7, 6, 106, 28);
		lblEmpty.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNumFree = new JLabel(String.valueOf(free));
		lblNumFree.setBounds(122, 7, 59, 28);
		lblNumFree.setFont(new Font("Tahoma", Font.BOLD, 16));

		add(pnEmpty);
		pnEmpty.setLayout(null);
		pnEmpty.add(lblEmpty);
		pnEmpty.add(lblNumFree);

	}

	// ACTION: as the name of function below
	private void addBusyTableProperties() {
		pnBusy = new JPanel();
		pnBusy.setBounds(215, 12, 186, 42);
		pnBusy.setBorder(new LineBorder(SystemColor.scrollbar));
		pnBusy.setBackground(new Color(255, 102, 102));

		lblBusy = new JLabel("B\u1eadn");
		lblBusy.setBounds(7, 6, 106, 28);
		lblBusy.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNumBusy = new JLabel(String.valueOf(busy));
		lblNumBusy.setBounds(121, 7, 59, 28);
		lblNumBusy.setFont(new Font("Tahoma", Font.BOLD, 16));

		add(pnBusy);
		pnBusy.setLayout(null);
		pnBusy.add(lblBusy);
		pnBusy.add(lblNumBusy);
	}

	// ACTION: as the name of function below
	private void addRepairTableProperties() {
		pnRepair = new JPanel();
		pnRepair.setBounds(419, 12, 186, 42);
		pnRepair.setBorder(new LineBorder(SystemColor.scrollbar));
		pnRepair.setBackground(new Color(255, 255, 153));

		lblRepair = new JLabel("B\u1EA3o tr\u00EC");
		lblRepair.setBounds(8, 6, 106, 28);
		lblRepair.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNumRepair = new JLabel("3");
		lblNumRepair.setBounds(121, 6, 59, 28);
		lblNumRepair.setFont(new Font("Tahoma", Font.BOLD, 16));
		setLayout(null);

		add(pnRepair);
		pnRepair.setLayout(null);
		pnRepair.add(lblRepair);
		pnRepair.add(lblNumRepair);
	}

	// MARK:- notify component's changes
	public void notifyGridChanged(int free, int busy) {
		

		this.lblNumFree.setText(String.valueOf(free));
		this.lblNumBusy.setText(String.valueOf(busy));
		this.revalidate();
		this.repaint();

	}
}
