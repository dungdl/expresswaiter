package com.view.ui.frame;

import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class UIHome extends JFrame {

	// MARK:- Components
	private JPanel contentPane;
	private JPanel pnInfo;
	private JPanel pnTables;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(this.frame_x, this.frame_y, this.frame_width, this.frame_height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		addPanelTable();
		addPanelInfo();
		addTestTable("Table 12", false, this);
	}

	private void addPanelTable() {
		pnTables = new JPanel();
		pnTables.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		pnTables.setBounds(10, 10, this.frame_width - 26, this.frame_height - 133);
		contentPane.add(pnTables);
		pnTables.setLayout(null);
	}

	private void addPanelInfo() {
		pnInfo = new PanelInfo();
		pnInfo.setBounds(10, pnTables.getHeight() + 23, this.frame_width - 26, 70);
		contentPane.add(pnInfo);
	}

	// NOTE: FUNCTION FOR TESTING ONLY
	private void addTestTable(String tableName, boolean status, JFrame frame) {
		final String finalTableName = tableName;
		final boolean finalStatus = status;
		final JFrame finalHome = frame;
		JButton btnTestButt = new JButton(finalTableName);
		btnTestButt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UITableDetail frame = new UITableDetail(finalTableName, finalStatus, finalHome);
				setVisible(false);
				frame.setVisible(true);
			}
		});
		btnTestButt.setBounds(10, 10, 123, 70);
		pnTables.add(btnTestButt);
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

}
