package com.anthonyang.concreteStrategy;

import com.anthonyang.interfaces.CheckStrategy;

public class WordsLongerThan5 implements CheckStrategy {

	@Override
	public boolean check(String s) {
		if (s.equals(null) || s.length() == 0) {
			return false;
		}
		return s.length() > 5;
	}

}
