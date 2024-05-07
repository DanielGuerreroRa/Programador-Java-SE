package principal;

import service.SingletonService;

public class TestSingleton {

	public static void main(String[] args) {
		var s1=SingletonService.getInstance();
		var s2=SingletonService.getInstance();
		System.out.println(s1==s2);

	}

}
