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

interface MyList<T> {
	void add(T t);
	T get();
	boolean remove();
	
	
	default boolean moveFirst() {
		if(isEmpty()) return false;
		while(movePrev());
		return true;
	}
	boolean movePrev();
	boolean moveLast();
	boolean moveNext();
	
	boolean isBOL();
	boolean isEOL();
	boolean isEmpty();
	


}