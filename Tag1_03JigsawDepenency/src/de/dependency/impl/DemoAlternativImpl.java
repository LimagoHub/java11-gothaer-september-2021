package de.dependency.impl;

import de.dependency.Demo;

public class DemoAlternativImpl implements Demo {

	@Override
	public void foo() {
		System.out.println("Alternative");

	}

	@Override
	public String getName() {
		
		return "alternativ";
	}

}
