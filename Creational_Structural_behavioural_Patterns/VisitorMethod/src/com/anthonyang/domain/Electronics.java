package com.anthonyang.domain;

import com.anthonyang.interfaces.MakeVisitable;
import com.anthonyang.interfaces.Visitor;

public class Electronics implements MakeVisitable {
	private double price;

	public Electronics(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	/**
	 * Pass in a Visitor object (PurchaseVisitor is a Visitor type object as it
	 * implements Visitor).
	 * 
	 * Use it to invoke the correct visitPuchase() through method overloading
	 * (polymorphism) by passing in this class object (Electronics).
	 * 
	 * return the amount in double.
	 * 
	 */
	@Override
	public double acceptPurchase(Visitor visitor) {
		return visitor.visitPuchase(this);
	}

}
