package com.view.ui.frame;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.business.functions.PullBill;
import com.model.business.models.Bill;
import com.model.data_access.DataRef;
import com.view.ui.dialog.DialogPaidBill;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UITableDetail extends JFrame {

	// MARK:- Components
	private JPanel contentPane;
	private JTable table;
	private JButton btnPaid;
	private JButton btnBack;
	private JButton btnCancel;
	private JPanel pnTableName;
	private JLabel lblTableName;
	private JPanel pnStatus;
	private JLabel lblStatus;
	private JFrame home;
	private JScrollPane scrollPane;


	// MARK:- Values
	private int frame_x;
	private int frame_y;
	private int frame_width;
	private int frame_height;
	private double screen_width;
	private double screen_height;
	private String tableId;
	private Bill bill;

	// MARK:- Constants
	private final double SCALE_X = 0.15625;
	private final double SCALE_Y = 0.046296296296296294;
	private final double SCALE_HEIGHT = 0.9259259259259259;
	private final double SCALE_WIDTH = 0.7291666666666666;
	/**
	 * Create the frame.
	 */
	public UITableDetail(String tableName, boolean paid, JFrame home, String tableId) {
		this.tableId = tableId;
		PullBill pb = new PullBill(this, tableId, DataRef.createInstance().getBillRef());
		setTitle(tableName);
		setResizable(false);
		generateFrameSize();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		showDialogWhenExit();
		setBounds(this.frame_x, this.frame_y, 613, 642);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.home = home;

		setVisible(true);

		addPaidButton(addBillTable(), this);
		addCancelButton();
		addBackButton();
		addInfoBar(tableName, paid);

	}

	private Object[][] addBillTable() {
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 457, 581);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBorder(new LineBorder(SystemColor.activeCaptionBorder));

		Object[][] orderList = { { "Chicken", "50", "1", "10", new Integer(0) },
				{ "Rice", "10", "5", "5", new Integer(0) }, { "Beer", "5", "10", "0", new Integer(0) },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, };

		for (Object[] o : orderList) {
			if (o[0] != null) {
				o[4] = Integer.parseInt((String) o[2]) * Integer.parseInt((String) o[1])
						* (100 - Integer.parseInt((String) o[3])) / 100;
			}
		}

		table.setModel(
				new DefaultTableModel(orderList, new String[] { "Food", "Amount", "Price", "Discount", "Subtotal" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(106);
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(37);
		table.getColumnModel().getColumn(4).setPreferredWidth(32);

		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(25);

		return orderList;
	}

	public void addBtnPaidActionListener(ActionListener listener) {
		this.btnPaid.addActionListener(listener);
	}
	
	public void addBtnCancelActionListener(ActionListener listener) {
		this.btnCancel.addActionListener(listener);
	}
	
	public void addBtnBackActionListener(ActionListener listener) {
		this.btnBack.addActionListener(listener);
	}
	
	// Add pay button (nut thanh toan)
	private void addPaidButton(Object[][] orderList, JFrame frame) {
		final Object[][] finalOrderList = orderList;
		final JFrame finalFrame = frame;
		btnPaid = new JButton("Thanh To\u00E1n");
		btnPaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPaid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaid.setBackground(new Color(102, 204, 102));
		btnPaid.setBounds(477, 419, 120, 58);
		contentPane.add(btnPaid);
	}

	// Add cancel button (nut huy don)
	private void addCancelButton() {
		btnCancel = new JButton("H\u1EE7y \u0110\u01A1n");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(477, 488, 120, 58);
		btnCancel.setBackground(new Color(255, 102, 102));
		contentPane.add(btnCancel);
		setVisible(true);
	}

	private void addBackButton() {
		// BUTTON ACTION: BACK TO HOME
		btnBack = new JButton("\u2190");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBack.setBounds(477, 557, 118, 35);
		contentPane.add(btnBack);
	}

	// Add info bar (thanh thong tin o ben phai)
	private void addInfoBar(String tableName, boolean paid) {

		// LABEL: Show table's name
		pnTableName = new JPanel();
		pnTableName.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		pnTableName.setBounds(477, 11, 120, 40);
		contentPane.add(pnTableName);
		pnTableName.setLayout(null);
		{
			lblTableName = new JLabel(tableName);
			lblTableName.setHorizontalAlignment(SwingConstants.CENTER);
			lblTableName.setFont(new Font("Arial", Font.PLAIN, 15));
			lblTableName.setBounds(10, 11, 100, 18);
			pnTableName.add(lblTableName);
		}

		// LABEL: Show table's status
		pnStatus = new JPanel();
		pnStatus.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		pnStatus.setBounds(477, 64, 120, 40);
		contentPane.add(pnStatus);
		pnStatus.setLayout(null);
		{
			if (paid) {
				lblStatus = new JLabel("FREE");
				pnStatus.setBackground(new Color(182, 182, 182));

			} else {
				lblStatus = new JLabel("BUSY");
				pnStatus.setBackground(new Color(253, 243, 121));
			}
			lblStatus.setFont(new Font("Arial", Font.PLAIN, 15));
			lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
			lblStatus.setBounds(10, 11, 100, 18);
			pnStatus.add(lblStatus);
		}

	}

	// Hien thong bao xac nhan thoat khi bam X hoac Alt F4
	private void showDialogWhenExit() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				String ObjButtons[] = { "Yes", "No" };
				int PromptResult = JOptionPane.showOptionDialog(null, "Back to home?", "Smart Restaurant",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
				if (PromptResult == JOptionPane.YES_OPTION) {
					UITableDetail.this.dispose();
					home.setVisible(true);
				}
			}
		});
	}

	private void generateFrameSize() {
		this.screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;
		this.screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.frame_x = (int) (screen_width * SCALE_X); //
		this.frame_y = (int) (screen_height * SCALE_Y);
		this.frame_width = (int) (screen_width * SCALE_WIDTH);
		this.frame_height = (int) (screen_height * SCALE_HEIGHT);
	}
	
	public void setBill(Bill bill) {
		this.bill = bill;
	}
}