package view;

interface I1{
	void print();
}
class CA implements I1{ 
	public void print(){
		System.out.println("CA");
	}
}
class CB extends CA{
	public void print(){
		System.out.println("CB");
	}
}
class CC extends CB{

}
public class Prueba4 {

	public static void main(String[] args) {
		CC c=new CC();
		c.print(); //1
		CB b=c;
		b.print(); //2
		CA a=c;
		a.print(); //3
		I1 i=c;
		i.print(); //4  veces sale impreso

	}

}
