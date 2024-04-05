package view;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		LocalDate f1=LocalDate.now();
		LocalDate f2=LocalDate.of(2021,11,3);
		System.out.println(f1);
		System.out.println(f2);
		
		LocalDate f3=LocalDate.of(2024, 2, 28);
		System.out.println(f3.plusMonths(2));
		System.out.println(f3.plusDays(10));
	}

}
