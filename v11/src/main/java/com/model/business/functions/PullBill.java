package com.model.business.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.model.business.models.Bill;
import com.model.business.models.Order;
import com.model.data_access.DataRef;
import com.view.ui.frame.UIHome;
import com.view.ui.frame.UITableDetail;

public class PullBill {

	// MARK:- Values
	private UITableDetail ui_tableDetail;
	private String tableId;
	private DatabaseReference billRef;

	// MARK:- Constructor:
	public PullBill(UITableDetail ui_tableDetail, String tableId, DatabaseReference billRef) {
		this.ui_tableDetail = ui_tableDetail;
		this.tableId = tableId;
		this.billRef = billRef;
		interactWithDb();
	}

	// MARK:- Functions
	// TO-DO: get data from database
	private void interactWithDb() {
		billRef.addChildEventListener(new ChildEventListener() {

			public void onChildRemoved(DataSnapshot snapshot) {
				// TODO Auto-generated method stub

			}

			public void onChildMoved(DataSnapshot snapshot, String previousChildName) {
				// TODO Auto-generated method stub

			}

			public void onChildChanged(DataSnapshot snapshot, String previousChildName) {
				// TODO Auto-generated method stub

			}

			public void onChildAdded(DataSnapshot snapshot, String previousChildName) {
				Bill bill = snapshot.getValue(Bill.class);
				if (bill.getTableId().equals(PullBill.this.tableId) && !bill.getChecked()) {

					

					PullBill.this.ui_tableDetail.setBill(bill);

				}
			}

			public void onCancelled(DatabaseError error) {
				// TODO Auto-generated method stub

			}
		});
	}
}
