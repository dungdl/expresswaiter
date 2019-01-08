package com.model.business.functions;

import java.util.ArrayList;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.model.business.models.Floor;

public class PullFloor {

	// MARK:- Values
	private ArrayList<Floor> listFloor;
	private DatabaseReference floorRef;

	// MARK:- Constructor
	public PullFloor(DatabaseReference floorRef) {
		this.listFloor = new ArrayList<Floor>();
		this.floorRef = floorRef;
		interactWithDb();
	}

	// MARK:- Functions

			// TO-DO: get data from database
	private void interactWithDb() {
		floorRef.addChildEventListener(new ChildEventListener() {

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
				Floor floor = snapshot.getValue(Floor.class);
				PullFloor.this.listFloor.add(floor);
			}

			public void onCancelled(DatabaseError error) {
				// TODO Auto-generated method stub

			}
		});
	}



	// MARK:- Getters Setters
	public ArrayList<Floor> getListFloor() {
		return listFloor;
	}
}
