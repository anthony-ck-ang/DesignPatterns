package com.anthonyang.concreteToppings;

import com.anthonyang.decorator.ToppingsDecorator;
import com.anthonyang.interfaces.YogurtIceCream;

public class Almond extends ToppingsDecorator {

	public Almond(YogurtIceCream yoghurtIcecream) {
		super(yoghurtIcecream);
	}

	@Override
	public String getDescription() {
		return tempYoghurtIcecream.getDescription() + " , with Almonds";
	}

	@Override
	public double getPrice() {
		System.out.println("The almond topping cost:" + 1.5);
		return tempYoghurtIcecream.getPrice() + 1.5;
	}

}
