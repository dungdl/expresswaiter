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
	private JLabel lblNumEmpty;
	private JPanel pnBusy;
	private JLabel lblBusy;
	private JLabel lblNumBusy;
	private JPanel pnRepair;
	private JLabel lblRepair;
	private JLabel lblNumRepair;
	/**
	 * Create the panel.
	 */
	public PanelInfo() {
		setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		
		addEmptyTableProperties();
		addBusyTableProperties();
		addRepairTableProperties();
	}
	
	// Separate code for easily understand
	
	// ACTION: as the name of function below
	private void addEmptyTableProperties() {
		pnEmpty = new JPanel();
		pnEmpty.setBounds(11, 12, 186, 42);
		pnEmpty.setBorder(new LineBorder(SystemColor.scrollbar));
		pnEmpty.setBackground(new Color(255, 255, 153));
		
		lblEmpty = new JLabel("Free");
		lblEmpty.setBounds(7, 6, 106, 28);
		lblEmpty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNumEmpty = new JLabel("0");
		lblNumEmpty.setBounds(122, 7, 59, 28);
		lblNumEmpty.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		add(pnEmpty);
		pnEmpty.setLayout(null);
		pnEmpty.add(lblEmpty);
		pnEmpty.add(lblNumEmpty);
	}
	
	
	// ACTION: as the name of function below
	private void addBusyTableProperties() {
		pnBusy = new JPanel();
		pnBusy.setBounds(215, 12, 186, 42);
		pnBusy.setBorder(new LineBorder(SystemColor.scrollbar));
		pnBusy.setBackground(new Color(102, 204, 102));
		
		lblBusy = new JLabel("Busy");
		lblBusy.setBounds(7, 6, 106, 28);
		lblBusy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNumBusy = new JLabel("0");
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
		pnRepair.setBackground(new Color(255, 102, 102));
		
		lblRepair = new JLabel("Repair");
		lblRepair.setBounds(8, 6, 106, 28);
		lblRepair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNumRepair = new JLabel("0");
		lblNumRepair.setBounds(121, 6, 59, 28);
		lblNumRepair.setFont(new Font("Tahoma", Font.BOLD, 16));
		setLayout(null);
		
		add(pnRepair);
		pnRepair.setLayout(null);
		pnRepair.add(lblRepair);
		pnRepair.add(lblNumRepair);
	}
}
