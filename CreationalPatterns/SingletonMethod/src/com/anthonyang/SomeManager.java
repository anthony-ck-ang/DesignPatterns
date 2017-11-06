package com.anthonyang;

public class SomeManager {
	private static SomeManager INSTANCE;
	private int counter;

	// prevents creation of objects outside this class
	private SomeManager() {
		counter++;
	}

	public static SomeManager getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SomeManager();
		}
		return INSTANCE;
	}

	public int getCounter() {
		return counter;
	}

}
