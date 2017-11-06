package com.anthonyang;

public class App {
	public static void main(String[] args) {
		SomeManager object = SomeManager.getInstance();
		System.out.println(object.getCounter());
		
		SomeManager object2 = SomeManager.getInstance();
		System.out.println(object.getCounter());	//counter will always be 1 -> only one object is created and returned
	}
}
