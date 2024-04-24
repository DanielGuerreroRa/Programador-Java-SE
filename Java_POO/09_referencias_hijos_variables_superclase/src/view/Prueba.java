package view;
class C1{
	int a =3;
	public void print() {
		System.out.println("C1");
	}
}
class C2 extends C1{
	int a=5;
	public void print() {
		System.out.println("C2");
	}
	public void send() {
		System.out.println("Enviando...");
	}
}
public class Prueba {

	public static void main(String[] args) {
		C1 c=new C2();
		c.print();
		//c.send(); NO, porque ese tipo de método no está definido en superclase
		System.out.println(c.a);
	}

}
