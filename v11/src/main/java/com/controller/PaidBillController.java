package com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.model.business.functions.PushBill;
import com.model.data_access.DataRef;
import com.view.ui.dialog.DialogPaidBill;
import com.view.ui.frame.UIHome;
import com.view.ui.frame.UITableDetail;

public class PaidBillController {
	private DialogPaidBill dialogPaidBill;
	private UITableDetail uiTableDetail;

	public PaidBillController(DialogPaidBill dialogPaidBill, UITableDetail uiTableDetail) {
		this.dialogPaidBill = dialogPaidBill;
		this.uiTableDetail = uiTableDetail;
		listenOkBtn();
		listenCancelBtn();
	}

	private void listenOkBtn() {
		dialogPaidBill.addBtnOkListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (dialogPaidBill.getRbPrintBill().isSelected())
					System.out.println("In h\u00F3a \u0111\u01A1n");
				else
					System.out.println("Kh\u00F4ng in h\u00F3a \u0111\u01A1n");

				PushBill.push(DataRef.createInstance().getBillRef(), uiTableDetail.getBill(),
						DataRef.createInstance().getTableRef());

				uiTableDetail.dispose();
				dialogPaidBill.dispose();
				UIHome home = new UIHome();

			}
		});
	}

	private void listenCancelBtn() {
		dialogPaidBill.addBtnCancelListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dialogPaidBill.setVisible(false);
			}
		});
	}
}
