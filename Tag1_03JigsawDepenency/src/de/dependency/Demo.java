package de.dependency;

import de.dependency.impl.DemoImpl;

public interface Demo {

	void foo();
	static Demo create() {
		return new DemoImpl();
	}

}