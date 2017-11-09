package com.anthonyang.concreteStrategy;

import com.anthonyang.interfaces.CheckStrategy;

public class AllWords implements CheckStrategy {

	@Override
	public boolean check(String s) {
		return true;
	}

}
