package com.view.ui.frame;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JScrollPane;

public class UITableDetail extends JFrame {

	// MARK:- Components
	private JPanel contentPane;
	private JTable table;
	private JButton btnPayButton;
	private JButton btnBack;
	private JButton btnCancel;
	private JPanel pnTableName;
	private JLabel lblTableName;
	private JPanel pnStatus;
	private JLabel lblStatus;

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
	private final double SCALE_HEIGHT = 0.9259259259259259;
	private final double SCALE_WIDTH = 0.7291666666666666;
	private JScrollPane scrollPane;

	/**
	 * Create the frame.
	 */
	public UITableDetail(String tableName, boolean paid) {
		setTitle(tableName);
		setResizable(false);
		generateFrameSize();
		setBounds(this.frame_x, this.frame_y, 580, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		addPayButton(addBillTable(), this);
		addCancelButton(this);
		addBackButton();
		addInfoBar(tableName, paid);

	}

	private Object[][] addBillTable() {
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 416, 581);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setBorder(new LineBorder(SystemColor.activeCaptionBorder));

		Object[][] orderList = { { "Chicken", "1", "50" }, { "Rice", "5", "50" }, { "Beer", "10", "50" },
				{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, { null, null, null } };

		table.setModel(new DefaultTableModel(orderList, new String[] { "Food ", "Amount", "Price" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(104);
		table.getColumnModel().getColumn(1).setPreferredWidth(49);
		table.getColumnModel().getColumn(2).setPreferredWidth(49);

		return orderList;
	}

	// Add pay button (nut thanh toan)
	private void addPayButton(Object[][] orderList, JFrame frame) {
		final Object[][] finalOrderList = orderList;
		final JFrame finalFrame = frame;
		btnPayButton = new JButton("Thanh To\u00E1n");
		btnPayButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					DialogPayBill dialog = new DialogPayBill(finalOrderList, finalFrame);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		btnPayButton.setBounds(436, 419, 120, 58);
		contentPane.add(btnPayButton);
	}

	// Add cancel button (nut huy don)
	private void addCancelButton(JFrame frame) {
		final JFrame finalFrame = frame;
		btnCancel = new JButton("H\u1EE7y \u0110\u01A1n");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					DialogCancelBill dialog = new DialogCancelBill(finalFrame);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnCancel.setBounds(436, 488, 120, 58);
		contentPane.add(btnCancel);

		setVisible(true);
	}

	private void addBackButton() {
		// BUTTON ACTION: BACK TO HOME
		btnBack = new JButton("\u2190");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBack.setBounds(436, 557, 118, 35);
		contentPane.add(btnBack);
	}

	// Add info bar (thanh thong tin o ben phai)
	private void addInfoBar(String tableName, boolean paid) {

		// LABEL: Show table's name
		pnTableName = new JPanel();
		pnTableName.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		pnTableName.setBounds(436, 6, 120, 58);
		contentPane.add(pnTableName);
		pnTableName.setLayout(null);
		{
			lblTableName = new JLabel(tableName);
			lblTableName.setFont(new Font("Arial", Font.PLAIN, 15));
			lblTableName.setBounds(10, 11, 79, 36);
			pnTableName.add(lblTableName);
		}

		// LABEL: Show table's status
		pnStatus = new JPanel();
		pnStatus.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		pnStatus.setBounds(436, 75, 120, 58);
		contentPane.add(pnStatus);
		pnStatus.setLayout(null);
		{
			if (paid) {
				lblStatus = new JLabel("PAID");
				pnStatus.setBackground(new Color(182, 182, 182));

			} else {
				lblStatus = new JLabel("UNPAID");
				pnStatus.setBackground(new Color(255, 102, 102));
			}
			lblStatus.setFont(new Font("Arial", Font.PLAIN, 15));
			lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
			lblStatus.setBounds(10, 11, 97, 36);
			pnStatus.add(lblStatus);
		}

	}

	private void generateFrameSize() {
		this.screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;
		this.screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;

		this.frame_x = (int) (screen_width * SCALE_X); //
		this.frame_y = (int) (screen_height * SCALE_Y);
		this.frame_width = (int) (screen_width * SCALE_WIDTH);
		this.frame_height = (int) (screen_height * SCALE_HEIGHT);
	}
}
