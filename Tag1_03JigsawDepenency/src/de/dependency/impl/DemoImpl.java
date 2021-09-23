package de.dependency.impl;

import de.dependency.Demo;
import de.transformer.Transformer;

public class DemoImpl implements Demo {
	
	private Transformer transformer = Transformer.create(Transformer.UPPER);
	
	@Override
	public void foo() {
		System.out.println(transformer.transform("Hier ist foo von Demo"));
	}

	@Override
	public String getName() {
		return "echte";
	}

}
