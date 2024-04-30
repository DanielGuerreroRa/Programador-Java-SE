package principal;

import java.util.Date;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		Date d;  //java.util.Date
		java.sql.Date v;
		BiPredicate<String,String> b1=Object::equals;

		Object a="hello";
		Object b="hello";
		
		System.out.println(a.equals(b)); //true
	}

}
