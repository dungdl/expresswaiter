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

			@Override
			public void actionPerformed(ActionEvent e) {
				if (dialogPaidBill.getRbPrintBill().isSelected())
					System.out.println("Print bill");
				else
					System.out.println("No print bill");

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

			@Override
			public void actionPerformed(ActionEvent e) {
				dialogPaidBill.setVisible(false);
			}
		});
	}
}
