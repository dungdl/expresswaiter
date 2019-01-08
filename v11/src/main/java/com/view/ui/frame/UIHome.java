package com.view.ui.frame;

import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.controller.TableDetailController;
import com.google.firebase.database.DatabaseReference;
import com.model.business.functions.PullTable;
import com.model.business.models.Table;
import com.model.data_access.DataRef;
import com.view.ui.panel.PanelInfo;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class UIHome extends JFrame {

	// MARK:- Components
	private JPanel contentPane;
	private PanelInfo pnInfo;
	private JScrollPane scrollPane;
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

	private int busy;
	private int free;

	// MARK:- Constants
	private final double SCALE_X = 0.15625;
	private final double SCALE_Y = 0.046296296296296294;
	private final double SCALE_WIDTH = 0.63982430453;
	private final double SCALE_HEIGHT = 0.86328125;
	private JScrollBar scrollBar;

	// MARK:- Constructor

	/**
	 * Create the frame.
	 */
	public UIHome() {
		setTitle("Express Accountant");
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

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 16));

		pnFirstFloor = new JPanel();
		addFloorPane("Floor 1", pnFirstFloor);
		pnSecondFloor = new JPanel();
		addFloorPane("Floor 2", pnSecondFloor);
		pnThirdFloor = new JPanel();
		addFloorPane("Floor 3", pnThirdFloor);

		this.busy = 0;
		this.free = 0;

		PullTable table = new PullTable(this, DataRef.createInstance().getTableRef());
		addPanelInfo();

	}

	private void addPanelInfo() {
		pnInfo = new PanelInfo(this.free, this.busy);
		pnInfo.setBackground(Color.WHITE);
		pnInfo.setBounds(10, tabbedPane.getHeight() + 23, this.frame_width - 26, 70);
		contentPane.add(pnInfo);
		notifyGridChanged();
	}

	private void addFloorPane(String paneName, JPanel pnFloor) {

		pnFloor.setBackground(Color.WHITE);
		pnFloor.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		pnFloor.setPreferredSize(new Dimension(this.frame_width - 52, 1000));

		scrollPane = new JScrollPane();
		scrollPane.setViewportView(pnFloor);
		scrollBar = new JScrollBar(JScrollBar.VERTICAL) {
			@Override
			public boolean isVisible() {
				return true;
			}
		};
		scrollPane.setVerticalScrollBar(scrollBar);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

		tabbedPane.setBounds(10, 10, this.frame_width - 26, this.frame_height - 133);
		tabbedPane.addTab(paneName, null, scrollPane, null);

		contentPane.add(tabbedPane);

		notifyGridChanged();
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

	// NOTE:

	public void addTable(Table table) {
		final String finalTableName = "B\u00E0n " + table.getName();
		final boolean finalStatus = table.getIsAvailable();
		final String finalTableId = table.getId();
		JButton btnTable = new JButton(finalTableName);
		// change color
		if (finalStatus) {
			btnTable.setBackground(new Color(102, 204, 102));
			this.free++;
		} else {
			btnTable.setBackground(new Color(255, 102, 102));
			this.busy++;
			btnTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					UITableDetail frame = new UITableDetail(finalTableName, finalStatus, UIHome.this, finalTableId);
					TableDetailController controller = new TableDetailController(frame, UIHome.this);
					setVisible(false);
					frame.setVisible(true);
				}
			});
		}

		btnTable.setFont(new Font("Arial", Font.PLAIN, 15));

		btnTable.setBounds(10, 10, 123, 70);
		btnTable.setPreferredSize(new Dimension((pnFirstFloor.getWidth() - 60) / 5, 80));
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

		pnInfo.notifyGridChanged(free, busy);

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
		this.revalidate();
		this.repaint();

	}

}
