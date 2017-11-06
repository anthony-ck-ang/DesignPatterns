package com.anthonyang.adapter;

import com.anthonyang.Iphone;
import com.anthonyang.androidPhone.Android;

public class PhoneAdapter implements Android {
	protected Iphone phone;

	@Override
	public void use() {
	}

	public void makeCompatible(Iphone phone) {
		this.phone = phone;
	}

	public Iphone getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "PhoneAdapter [phone=" + phone + "]";
	}

}
