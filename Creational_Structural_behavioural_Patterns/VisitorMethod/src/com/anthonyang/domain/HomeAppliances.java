package com.anthonyang.domain;

import com.anthonyang.interfaces.MakeVisitable;
import com.anthonyang.interfaces.Visitor;

public class HomeAppliances implements MakeVisitable {
	private double price;

	public HomeAppliances(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double acceptPurchase(Visitor visitor) {
		return visitor.visitPuchase(this);
	}
}
