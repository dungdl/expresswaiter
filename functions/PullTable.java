package com.model.business.functions;

import java.util.ArrayList;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.model.business.models.Table;

public class PullTable {
	// MARK:- Values
	private ArrayList<Table> listTable;

	// MARK:- Constructor
	public PullTable() {
		this.listTable = new ArrayList<Table>();
		interactWithDb();
	}

	// MARK:- Functions

	// TO-DO: Get data from database
	private void interactWithDb() {
		DatabaseReference ref = FirebaseDatabase.getInstance().getReference("table");
		ref.addValueEventListener(new ValueEventListener() {

			public void onDataChange(DataSnapshot snapshot) {
				for (DataSnapshot data : snapshot.getChildren()) {
					Table table = data.getValue(Table.class);
					System.out.println(table.getName());
				}
			}

			public void onCancelled(DatabaseError error) {
				// TODO Auto-generated method stub

			}
		});
	}

	// MARK:- Getters Setters
	public ArrayList<Table> getListTable() {
		return listTable;
	}
}
