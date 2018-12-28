package com.model.business.functions;

import java.util.ArrayList;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.model.business.models.Bill;

public class PullBill {

	// MARK:- Values
	private ArrayList<Bill> listBill;

	// MARK:- Constructor:
	public PullBill() {
		this.listBill = new ArrayList<Bill>();
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
				System.out.println(bill.getListOrder().size());
			}

			public void onCancelled(DatabaseError error) {
				// TODO Auto-generated method stub

			}
		});
	}
}
