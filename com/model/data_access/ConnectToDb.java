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

	public ConnectToDb() {
		try {
			init();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void init() throws IOException {
		serviceAccount = new FileInputStream(
				"E:\\Software Engineering\\v11\\src\\main\\java\\com\\model\\data_access\\orderapp-fdb78-firebase-adminsdk-0am27-017859a1aa.json");

		options = new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://orderapp-fdb78.firebaseio.com/").build();
		FirebaseApp.initializeApp(options);
	}

}
