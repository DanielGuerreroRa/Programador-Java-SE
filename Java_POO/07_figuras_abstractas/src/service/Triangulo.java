package service;

public class Triangulo extends Figura implements Operaciones{
	private int base, altura;

	public Triangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base*altura/2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void girar(int grados) {
		base+=grados;
		altura+=grados;
		
	}

	@Override
	public int invertir() {
		base--;
		return base+altura;
	}
	
}