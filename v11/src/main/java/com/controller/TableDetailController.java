package com.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.view.ui.dialog.DialogPaidBill;
import com.view.ui.frame.UIHome;
import com.view.ui.frame.UITableDetail;

public class TableDetailController {

	UITableDetail ui_tableDetail;
	UIHome ui_home;

	public TableDetailController(UITableDetail uiTableDetail, UIHome ui_home) {
		this.ui_tableDetail = uiTableDetail;
		this.ui_home = ui_home;
//		listenBtnCancel();
		listenBtnPaid();
		listenBtnBack();
	}

	// Add pay button (nut thanh toan)
	private void listenBtnPaid() {
		this.ui_tableDetail.addBtnPaidActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// TO-DO: transform 2-dimension array into an array-list
					
					
					DialogPaidBill dialog = new DialogPaidBill(TableDetailController.this.ui_tableDetail.getOrderList(),
							TableDetailController.this.ui_tableDetail);
					
					PaidBillController controller = new PaidBillController(dialog, ui_tableDetail);
					
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
	}

	// Add cancel button (nut huy don)
//	private void listenBtnCancel() {
//		this.ui_tableDetail.addBtnCancelActionListener(new ActionListener() {
//
//			public void actionPerformed(ActionEvent e) {
//				String ObjButtons[] = { "Yes", "No" };
//				int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to cancel this bill?",
//						"Smart Restaurant", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
//						ObjButtons[1]);
//				if (PromptResult == JOptionPane.YES_OPTION) {
//					TableDetailController.this.ui_tableDetail.dispose();
//					UIHome home = new UIHome();
//				}
//
//			}
//		});
//	}

	private void listenBtnBack() {
		this.ui_tableDetail.addBtnBackActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				TableDetailController.this.ui_tableDetail.dispose();
				TableDetailController.this.ui_home.setVisible(true);
			}
		});
	}
}