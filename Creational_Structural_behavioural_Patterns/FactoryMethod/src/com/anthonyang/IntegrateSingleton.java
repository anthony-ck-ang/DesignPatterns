package com.anthonyang;

public class IntegrateSingleton implements Animal {
	private static IntegrateSingleton INSTANCE;
	private static int counter;

	private IntegrateSingleton() {
		counter++;
	};

	public static IntegrateSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new IntegrateSingleton();
		}
		return INSTANCE;
	}

	@Override
	public void makeOwnerHeartMelt() {
		System.out.println("Singleton Animal");
		System.out.println(IntegrateSingleton.counter);
	}
}
