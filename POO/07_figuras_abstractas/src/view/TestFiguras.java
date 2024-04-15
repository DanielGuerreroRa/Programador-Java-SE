package view;

import service.Circulo;
import service.Figura;
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
		datosFigura(cir);
		System.out.println("Datos del triángulo: ");
		datosFigura(tri);
		
    }

    public static void datosFigura(Figura f1) {
        System.out.println("color: "+f1.getColor());
		System.out.println("area: "+f1.area());
   
    }
}

