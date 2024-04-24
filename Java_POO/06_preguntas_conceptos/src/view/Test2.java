package view;
class M1{
	int a;
	static int b=1;
	M1(){
		a++;
		b++;
	}
}
class M2 extends M1{
	int a;
	static int b;
	M2(){
		a++;
		b++;
	}
}
public class Test2 {

	public static void main(String[] args) {
		M1 m1=new M1();
		M2 m2=new M2();
		System.out.println(m2.a+":"+m2.b);//1:1
		System.out.println(m1.a+":"+m1.b);//1:3
	}

}
