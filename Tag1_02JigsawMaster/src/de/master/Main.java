package de.master;

import de.dependency.Demo;
import de.transformer.Transformer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Transformer t = Transformer.create(Transformer.UPPER);
		
		Demo demo = Demo.create("echte");
		Demo d2 = Demo.create("echte");
		
		System.out.println(demo == d2);
		
		demo.foo();
		
//		Object o = Class.forName("de.tiere.Schwein").getConstructor().newInstance();
//		System.out.println(o);
//		
//		Method m = o.getClass().getMethod("fressen");
//		
//		m.invoke(o);
//		
//		System.out.println(o);
//		
//		m = o.getClass().getDeclaredMethod("setGewicht", int.class);
//		m.setAccessible(true);
//		m.invoke(o, -10);
//		System.out.println(o);
	}

}
