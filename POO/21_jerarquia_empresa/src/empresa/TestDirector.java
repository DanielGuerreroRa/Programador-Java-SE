package empresa;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestDirector {

	@Test
	void testIncentivar() {
		Director director=new Director("a", 10, LocalDate.now().minusMonths(31), 2000, "d", 30);
		director.incentivar();
		assertEquals(3200, director.getSalario());
	}
	@Test
	void testIncentivar2() {
		Director director=new Director("a", 10, LocalDate.now().minusMonths(20), 2000, "d", 30);
		director.incentivar();
		assertEquals(2600, director.getSalario());
	}
	@Test
	void testIncentivar3() {
		Director director=new Director("a", 10, LocalDate.now().minusMonths(20), 2000, "d", 10);
		director.incentivar();
		assertEquals(2000, director.getSalario());
	}

}
