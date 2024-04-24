package view;

import service.ListNumber;

public class Test {

	public static void main(String[] args) {
		ListNumber lst=new ListNumber();
		lst.add(20);
		lst.add(30);
		lst.add(10);
		lst.add(20);
		System.out.println(lst.first());
		System.out.println(lst.last());
		System.out.println(lst.sum());
	}

}
