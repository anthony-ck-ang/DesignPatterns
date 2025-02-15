package com.anthonyang.interfaces;

import com.anthonyang.domain.Electronics;
import com.anthonyang.domain.Fashion;
import com.anthonyang.domain.HomeAppliances;

public interface Visitor {
	/*
	 * Only classes that implements this interface will be affected when new
	 * abstract methods are added.
	 * 
	 * Bean (data) classes (eg: products) will not be affected (no recompiling).
	 * Imagine you have 1000+ products..
	 * 
	 */
	public double visitPuchase(Electronics electronicsItem);

	public double visitPuchase(Fashion FashionItem);

	// newly added. (extension)
	public double visitPuchase(HomeAppliances homeAppliances);

}
