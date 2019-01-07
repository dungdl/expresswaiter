package com.model.business.functions;

import java.util.ArrayList;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.model.business.models.Bill;
import com.view.ui.frame.UIHome;
import com.view.ui.frame.UITableDetail;

public class PullBill {

	// MARK:- Values
	private UITableDetail ui_tableDetail;
	private String tableId;

	// MARK:- Constructor:
	public PullBill(UITableDetail ui_tableDetail, String tableId) {
		this.ui_tableDetail = ui_tableDetail;
		this.tableId = tableId;
		interactWithDb();
	}
	
	
	//MARK:-  	Functions
			//TO-DO: get data from database
	private void interactWithDb() {
		DatabaseReference ref = FirebaseDatabase.getInstance().getReference("bill");
		ref.addChildEventListener(new ChildEventListener() {

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
					System.out.println(bill.getDate());
					System.out.println(bill.getWaiter());
					System.out.println(bill.getId());
				}
			}

			public void onCancelled(DatabaseError error) {
				// TODO Auto-generated method stub

			}
		});
	}
}
