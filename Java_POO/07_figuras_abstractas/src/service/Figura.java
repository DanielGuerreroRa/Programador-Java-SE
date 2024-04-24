package service;

public abstract class Figura {
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double area();
}
