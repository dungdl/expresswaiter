package com.view.ui.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DialogCancelBill extends JDialog {
	
	
	// CANCEL BILL DIALOG: Show when click on cancel bill button
	// Nut huy don: hien ra khi an vao nut huy don
	
	
	private final JPanel contentPanel = new JPanel();

	// MARK:- Components
	private JLabel lblDialog;
	private JPanel pnButton;
	private JButton btnOk;
	private JButton btnCancel;
	
	/**
	 * Create the dialog.
	 */
	public DialogCancelBill(JFrame frame) {
		setResizable(false);
		final JFrame finalFrame = frame;
		setTitle("Bill Cancel Confirm");
		setBounds(100, 100, 339, 172);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblDialog = new JLabel("X\u00E1c nh\u1EADn h\u1EE7y \u0111\u01A1n?");
		lblDialog.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDialog.setHorizontalAlignment(SwingConstants.LEFT);
		lblDialog.setBounds(22, 26, 250, 51);
		contentPanel.add(lblDialog);
		{
			pnButton = new JPanel();
			pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(pnButton, BorderLayout.SOUTH);
			{
				btnOk = new JButton("OK");
				btnOk.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println("Cancel Bill");
						finalFrame.setVisible(false);
						setVisible(false);
						
					}
				});
				btnOk.setActionCommand("OK");
				pnButton.add(btnOk);
				getRootPane().setDefaultButton(btnOk);
			}
			{
				btnCancel = new JButton("Cancel");
				btnCancel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setVisible(false);
					}
				});
				btnCancel.setActionCommand("Cancel");
				pnButton.add(btnCancel);
			}
		}
	}

}
