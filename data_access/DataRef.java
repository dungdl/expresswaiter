package com.model.data_access;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataRef {
	private DatabaseReference floorRef;
	private DatabaseReference tableRef;
	private DatabaseReference billRef;
	
	private static DataRef instance;

	private DataRef() {
		floorRef = FirebaseDatabase.getInstance().getReference("floor");
		tableRef = FirebaseDatabase.getInstance().getReference("table");
		billRef = FirebaseDatabase.getInstance().getReference("bill");
	}
	
	public static void createInstance() {
		if (instance == null) {
			instance = new DataRef();
		} else {
			
		}
	}
}
