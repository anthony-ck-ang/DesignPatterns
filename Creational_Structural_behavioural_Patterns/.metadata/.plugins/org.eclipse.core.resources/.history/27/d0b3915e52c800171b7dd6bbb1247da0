package com.anthonyang.concreteClass;

import com.anthonyang.domain.Electronics;
import com.anthonyang.domain.Fashion;
import com.anthonyang.interfaces.Visitor;

public class PurchaseVisitor implements Visitor {

	// concrete class that implements the calculation/business logic.
	@Override
	public double visitPuchase(Electronics electronicsItem) {
		System.out.println("Electronics Item \nPrice with Delivery charges: ");
		return electronicsItem.getPrice() + 10;
	}

	@Override
	public double visitPuchase(Fashion FashionItem) {
		System.out.println("Fashion Item \nPrice with Delivery charges: ");
		return FashionItem.getPrice() + 5;
	}

}
