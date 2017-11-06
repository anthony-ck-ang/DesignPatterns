package com.anthonyang;

import com.anthonyang.adapter.PhoneAdapter;
import com.anthonyang.androidPhone.Samsung;

public class App {

	public static void main(String[] args) {
		Samsung samsung = new Samsung();

		User user = new User();
		user.setPhone("Samsung", samsung);

		Iphone iphone = new Iphone();
		// user.setPhone(iphone); // not compatible, cannot be added.

		// Create a phoneAdapter and set phone to it.
		PhoneAdapter phoneAdapter = new PhoneAdapter();
		phoneAdapter.makeCompatible(iphone);

		// user tries to set phone after adapter used.
		user.setPhone("Iphone", phoneAdapter); // now it is compatible. :)
		PhoneAdapter pA = (PhoneAdapter) user.getPhoneByKey("Iphone");
		System.out.println(pA.getPhone());
	}

}
