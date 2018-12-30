package com.view.ui.frame;

import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.LineBorder;

import com.model.business.models.Table;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class UIHome extends JFrame {

	// MARK:- Components
	private JPanel contentPane;
	private JPanel pnInfo;
	private JPanel pnTables;

	private JTabbedPane tabbedPane;

	private JPanel pnFirstFloor;
	private JPanel pnSecondFloor;
	private JPanel pnThirdFloor;

	// MARK:- Values
	private int frame_x;
	private int frame_y;
	private int frame_width;
	private int frame_height;
	private double screen_width;
	private double screen_height;

	// MARK:- Constants
	private final double SCALE_X = 0.15625;
	private final double SCALE_Y = 0.046296296296296294;
	private final double SCALE_WIDTH = 0.63982430453;
	private final double SCALE_HEIGHT = 0.86328125;

	// MARK:- Constructor

	/**
	 * Create the frame.
	 */
	public UIHome() {
		setTitle("Express Waiter");
		setResizable(false);
		generateFrameSize();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		showDialogWhenExit();
		setBounds(this.frame_x, this.frame_y, this.frame_width, this.frame_height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		addPanelTable();
		addPanelInfo();

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 16));

		pnFirstFloor = new JPanel();
		addFloorPane("Floor 1", pnFirstFloor);
		pnSecondFloor = new JPanel();
		addFloorPane("Floor 2", pnSecondFloor);
		pnThirdFloor = new JPanel();
		addFloorPane("Floor 3", pnThirdFloor);

	}

	private void addPanelTable() {
		pnTables = new JPanel();
		pnTables.setBackground(Color.WHITE);
		pnTables.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		pnTables.setBounds(10, 10, this.frame_width - 26, this.frame_height - 133);
		contentPane.add(pnTables);
		pnTables.setLayout(null);
		pnTables.setVisible(false);
	}

	private void addPanelInfo() {
		pnInfo = new PanelInfo();
		pnInfo.setBackground(Color.WHITE);
		pnInfo.setBounds(10, pnTables.getHeight() + 23, this.frame_width - 26, 70);
		contentPane.add(pnInfo);

	}

	private void addFloorPane(String paneName, JPanel pnFloor) {
		tabbedPane.setBounds(10, 10, this.frame_width - 26, this.frame_height - 133);
		tabbedPane.addTab(paneName, null, pnFloor, null);
		contentPane.add(tabbedPane);
		pnFloor.setLayout(new GridLayout(5, 4));
	}

	private void showDialogWhenExit() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				String ObjButtons[] = { "Yes", "No" };
				int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?",
						"Smart Restaurant", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
						ObjButtons[1]);
				if (PromptResult == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}

	// NOTE: FUNCTION FOR TESTING ONLY

	public void addTable(Table table) {
		final String finalTableName = "Bàn " + table.getName();
		final boolean finalStatus = table.getIsAvailable();
		JButton btnTable = new JButton(finalTableName);
		btnTable.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UITableDetail frame = new UITableDetail(finalTableName, finalStatus, UIHome.this);
				setVisible(false);
				frame.setVisible(true);
			}
		});
		btnTable.setBounds(10, 10, 123, 70);
		btnTable.setPreferredSize(new Dimension(160, 80));
		switch (table.getFloor_id()) {
		case 0:
			pnFirstFloor.add(btnTable);
			break;
		case 1:
			pnSecondFloor.add(btnTable);
			break;
		case 2:
			pnThirdFloor.add(btnTable);
			break;
		}
		this.notifyGridChanged();
	}

	// MARK:- Calculating methods
	private void generateFrameSize() {
		this.screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;
		this.screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;

		this.frame_x = (int) (screen_width * SCALE_X); //
		this.frame_y = (int) (screen_height * SCALE_Y);
		this.frame_width = (int) (screen_width * SCALE_WIDTH);
		this.frame_height = (int) (screen_height * SCALE_HEIGHT);
	}

	// MARK:- notify component's changes
	private void notifyGridChanged() {
		pnTables.revalidate();
		pnTables.repaint();
	}
}