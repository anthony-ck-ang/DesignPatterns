package com.anthonyang.androidPhone;

public class Samsung implements Android {
	private int ModelNo = 12345;
	@Override
	public void use() {
		System.out.println("Samsung running on Android");
	}
	@Override
	public String toString() {
		return "Samsung [ModelNo=" + ModelNo + "]";
	}

}
