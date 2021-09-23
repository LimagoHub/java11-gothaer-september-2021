package de.main;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		
		IntStream myStream = IntStream.rangeClosed(1, 1000);
		
		myStream.filter(Main::isPrime).forEach(System.out::println);
		
		
		
		Main m = new Main();
		
		Demo d = m.run();
		System.out.println(d.bar("Hallo"));

	}
	
	private static boolean isPrime(int possiblePrime) {
		for(int i = 2 ;i <= possiblePrime / 2; i++) {
			if(possiblePrime % i == 0) return false;
		}
		return true;
	}

	private Demo run() {
				
		final int x = 10;
		
		Demo result = text->text.length() + x;
	
		
		return result;
	}
	
	private int foo() {
		return 42;
	}

	private int strlen(String text) {
		return text.length();
	}

	
}
// Single Abstract Method Interfaces (SAM)
@FunctionalInterface
interface MyType {
	int bar();
	
}

@FunctionalInterface
interface Demo {
	int bar(String s);
	
}
