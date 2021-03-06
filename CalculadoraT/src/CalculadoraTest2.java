import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {

	@Test
	public void testResta() {
		Calculadora suma = new Calculadora(20, 10);
		int result = suma.resta();
		assertEquals(10, result);
	}

	@Test
	public void testResta2() {
		Calculadora suma = new Calculadora(10, 20);
		Boolean result = suma.resta2();
		assertTrue(result);
	}

	@Test
	public void testDivision2() {
		Calculadora suma = new Calculadora(20, 0);
		Integer result = suma.division2();
		assertNull(result);
	}

}
