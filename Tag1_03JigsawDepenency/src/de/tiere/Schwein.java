package de.tiere;

public class Schwein {
	
	private String name;
	private int gewicht;
	
	public Schwein() {
		this("nobody");
	}
	public Schwein(String name) {
		this.name = name;
		this.gewicht =10;
	}
	
	public void fressen() {
		setGewicht(getGewicht() + 1);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	@Override
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}
	
	

}
