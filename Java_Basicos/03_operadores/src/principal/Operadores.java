package principal;

public class Operadores {
	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println(b/a);
		b++; //b=b+1
		--a; //a=a-1
		int c=10;
		System.out.println(c++); // se suma despues de imprimirlo y sale 10
		System.out.println(c);  // aqui si sale la suma
		int n = --c; // n vale 10
		
		double r=3.5;
		r++;
		int x=5;
		int y=4;
		int z=8;
		System.out.println(x==y++); //false
		
		boolean rs=x>y || ++z>2;
		System.out.println(z);
		
	}

}
