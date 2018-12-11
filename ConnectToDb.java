package com.model.data_access;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JTextArea;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ConnectToDb {
	private FileInputStream serviceAccount;
	private FirebaseOptions options;
	private JTextArea txt;

	public ConnectToDb(JTextArea txt) {
		this.txt = txt;
		try {
			init();

			interactWithDb();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void init() throws FileNotFoundException, IOException {
		serviceAccount = new FileInputStream(
				"E:\\Software Engineering\\v11\\src\\main\\java\\com\\model\\data_access\\orderapp-fdb78-firebase-adminsdk-0am27-017859a1aa.json");

		options = new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://orderapp-fdb78.firebaseio.com/").build();
		FirebaseApp.initializeApp(options);
	}

	private void interactWithDb() {
		this.txt.setText("Initializing...");
		DatabaseReference ref = FirebaseDatabase.getInstance().getReference("");
		ref.addValueEventListener(new ValueEventListener() {
			  public void onDataChange(DataSnapshot dataSnapshot) {
				  ConnectToDb.this.txt.setText("Listening....");
				  ConnectToDb.this.txt.setText(dataSnapshot.toString());
			  }

			  public void onCancelled(DatabaseError databaseError) {
			    System.out.println("The read failed: " + databaseError.getCode());
			  }
			});
	}

}
