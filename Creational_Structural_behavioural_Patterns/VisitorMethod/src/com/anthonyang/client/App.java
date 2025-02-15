package com.anthonyang.client;

import com.anthonyang.concreteClass.PurchaseVisitor;
import com.anthonyang.domain.Electronics;
import com.anthonyang.domain.Fashion;
import com.anthonyang.domain.HomeAppliances;
import com.anthonyang.interfaces.Visitor;

public class App {

	public static void main(String[] args) {

		Electronics computer = new Electronics(2890.90);
		Fashion coat = new Fashion(199.90);
		HomeAppliances coffeeMachine = new HomeAppliances(89.90); // newly
																	// added.

		Visitor purchaseVisitor = new PurchaseVisitor();
		System.out.println(computer.acceptPurchase(purchaseVisitor));
		System.out.println(coat.acceptPurchase(purchaseVisitor));
		System.out.println(coffeeMachine.acceptPurchase(purchaseVisitor));// newly
																			// added.

	}

}
