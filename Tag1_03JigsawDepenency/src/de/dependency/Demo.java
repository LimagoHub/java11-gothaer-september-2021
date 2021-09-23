package de.dependency;

import java.util.ServiceLoader;

public interface Demo {

	String getName();
	void foo();
	static Demo create(final String variante) {
		return ServiceLoader.load(Demo.class)
				.stream()
				.filter(p->p.get().getName().equals(variante))
				.findFirst().get().get();
	}

}