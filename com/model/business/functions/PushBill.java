package com.model.business.functions;

import com.google.firebase.database.DatabaseReference;
import com.model.business.models.Bill;

public class PushBill {
	public static void push(DatabaseReference billRef, Bill bill) {
		billRef.setValueAsync(bill);
	}
}

