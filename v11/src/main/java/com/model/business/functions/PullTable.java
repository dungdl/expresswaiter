package com.model.business.functions;

import java.util.ArrayList;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.model.business.models.Table;
import com.view.ui.frame.UIHome;

public class PullTable {
	// MARK:- Values
	private ArrayList<Table> listTable;
	private DatabaseReference tableRef;

	UIHome home;

	// MARK:- Constructor
	public PullTable(UIHome home, DatabaseReference tableRef) {
		this.listTable = new ArrayList<Table>();
		this.tableRef = tableRef;
		this.home = home;
		interactWithDb();
	}

	// MARK:- Functions

	// TO-DO: Get data from database
	private void interactWithDb() {
		tableRef.addValueEventListener(new ValueEventListener() {

			public void onDataChange(DataSnapshot snapshot) {
				for (DataSnapshot data : snapshot.getChildren()) {

					Table table = data.getValue(Table.class);
					PullTable.this.home.addTable(table);

					
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
