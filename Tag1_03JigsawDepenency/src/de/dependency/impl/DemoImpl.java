package de.dependency.impl;

import de.dependency.Demo;

public class DemoImpl implements Demo {
	
	@Override
	public void foo() {
		System.out.println("Hier ist foo von Demo");
	}

}
