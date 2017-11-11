package com.anthonyang.concreteToppings;

import com.anthonyang.decorator.ToppingsDecorator;
import com.anthonyang.interfaces.YogurtIceCream;

public class Cranberry extends ToppingsDecorator {
	// by inheriting from ToppingsDecorator,
	// Cranberry class has access/reference to member variable of
	// ToppingsDecorator ->
	// tempYoghurtIcecream

	public Cranberry(YogurtIceCream yoghurtIcecream) {
		super(yoghurtIcecream); // yoghurtIcecream object is passed back to
								// parent
	}

	@Override
	public String getDescription() {
		// append new description to the tempYoghurtIcecream object in parent
		// and return it.
		return tempYoghurtIcecream.getDescription() + "with Cranberries";
	}

	@Override
	public double getPrice() {
		System.out.println("The price of cranberry topping cost: " + 1.0);
		return tempYoghurtIcecream.getPrice() + 1.0;
	}

}
