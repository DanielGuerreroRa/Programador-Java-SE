package service;

public class Circulo extends Figura{
	
	private double radio;


	@Override
	public double area() {
		return Math.PI*radio*radio;
	}
	
	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	

}
