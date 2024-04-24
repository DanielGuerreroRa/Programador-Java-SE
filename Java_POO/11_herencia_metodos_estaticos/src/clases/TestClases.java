package clases;
class C1{
	static void print() {
		System.out.println("C1");
	}
}
class C2 extends C1{
	
}

public class TestClases {

	public static void main(String[] args) {
		C2.print(); //C2 hereda el método estático

	}

}
