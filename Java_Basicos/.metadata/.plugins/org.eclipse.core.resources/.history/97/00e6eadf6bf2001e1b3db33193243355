package principal;

import java.util.HashSet;

class MyNumber{
	private Double num;

	public MyNumber(Double num) {
		this.num = num;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}
	
}
public class Pruebaconjunto2 {
	public static void main(String[] args) {
		HashSet<MyNumber> numeros = new HashSet<MyNumber>();
		numeros.add(new MyNumber(25.7));
		numeros.add(new MyNumber(30.2));
		numeros.add(new MyNumber(40.5));
		
		for(MyNumber n:numeros) {
			n.setNum(n.getNum()+1);
			
		}
		for(MyNumber n:numeros) {
			System.out.println(n.getNum());
		}
		
		




	}
}
