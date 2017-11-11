package com.anthonyang.decorator;

import com.anthonyang.interfaces.YogurtIceCream;

public abstract class ToppingsDecorator implements YogurtIceCream {
	/*
	 * Composition is stronger than Aggregation. A relationship between two
	 * objects is referred as an association. An association is composition when
	 * one object owns the other. An association is known as aggregation when
	 * one object uses another object.
	 */
	protected YogurtIceCream tempYoghurtIcecream; // the referenced
													// YogurtIceCream object
													// here is used by and
													// augmented in
													// child classes

	public ToppingsDecorator(YogurtIceCream yoghurtIcecream) {
		this.tempYoghurtIcecream = yoghurtIcecream;
	}

	public abstract String getDescription();

	public abstract double getPrice();

}
