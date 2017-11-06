package com.anthonyang;

import java.util.HashMap;

import com.anthonyang.androidPhone.Android;

public class User {
	private HashMap<String, Android> phones = new HashMap<>();

	public void setPhone(String phoneName, Android phone) {
		phones.put(phoneName, phone);
		System.out.println("User added... " + phone);
	}
	public Android getPhoneByKey(String key) {
		System.out.println("---------------------------");
		System.out.println("Getting ... ");
		return phones.get(key); // get phone from key
	}
}
