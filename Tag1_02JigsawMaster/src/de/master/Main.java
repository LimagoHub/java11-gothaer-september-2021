package de.master;

import de.dependency.Demo;

public class Main {

	public static void main(String[] args) {
		
		Demo demo = Demo.create();
		demo.foo();
	}

}
