package main.java;

import main.java.error.FirebaseException;
import main.java.model.FirebaseResponse;
import main.java.service.Firebase;

public class Fire {
    public static void main(String[] args) {
        Firebase firebase;
        FirebaseResponse response;
        try {
            firebase = new Firebase("https://orderapp-fdb78.firebase.com/");

            // GET the map back out of the firebase
            response = firebase.get();
            System.out.println( response );
        } catch (FirebaseException e) {
            e.printStackTrace();
        }
    }
}
