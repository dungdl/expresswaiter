package main.java;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class Main {

    public static class Post {

        public String author;
        public String title;

        public Post(String author, String title) {
            // ...
        }

    }

    public static void main(String[] args) {
        FileInputStream serviceAccount = null;
        try {
            serviceAccount =
                    new FileInputStream("E:\\Software Engineering\\Demo Java\\src\\main\\java\\orderapp-fdb78-firebase-adminsdk-0am27-017859a1aa.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://orderapp-fdb78.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);

            final FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference ref = database.getReference("account/nv1517912789208");
            System.out.println(ref);

// Attach a listener to read the data at our posts reference
            ref.addValueEventListener(new ValueEventListener() {
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Post post = dataSnapshot.getValue(Post.class);
                    System.out.println(post);
                }

                public void onCancelled(DatabaseError databaseError) {
                    System.out.println("The read failed: " + databaseError.getCode());
                }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
