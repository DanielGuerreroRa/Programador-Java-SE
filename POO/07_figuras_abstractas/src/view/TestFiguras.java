package view;

import service.Circulo;
import service.Figura;
import service.Mesa;
import service.Operaciones;
import service.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		//Crear un triángulo y un circulo con color y propiedades cualquiera, después mostrar el color y área de cada uno
		Circulo cir=new Circulo("amarillo", 5);
		Triangulo tri=new Triangulo("marrón",5,8);
		/*System.out.println("color:"+cir.getColor());
		System.out.println("area:"+cir.area());
		System.out.println("color:"+tri.getColor());
		System.out.println("area:"+tri.area());*/
		
		System.out.println("Datos del circulo: ");
		imprimir(cir);
		System.out.println("Datos del triángulo: ");
		imprimir(tri);

		//llamada a método que recibe la interfaz
		operar(tri);
		operar(new Mesa(2,11,5));
	}
	
	public static void imprimir(Figura f) {
		System.out.println("color:"+f.getColor());
		System.out.println("area:"+f.area());
	}
	
	public static void operar(Operaciones oper) {
		oper.girar(100);
		System.out.println(oper.invertir());
	}

}


