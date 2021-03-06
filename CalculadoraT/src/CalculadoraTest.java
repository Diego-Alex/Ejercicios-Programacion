import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora suma = new Calculadora(20, 10);
		int result = suma.suma();
		assertEquals(30, result);
	}

	@Test
	public void testResta() {
		Calculadora suma = new Calculadora(20, 10);
		int result = suma.resta();
		assertEquals(10, result);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora suma = new Calculadora(20, 10);
		int result = suma.multiplicacion();
		assertEquals(20, result);
	}

	@Test
	public void testDivision() {
		try{
		Calculadora suma = new Calculadora(20, 0);
		int result = suma.division();
		assertEquals(2, result);
		}catch(ArithmeticException e){
			//Prueba satisfactoria
		}
	}

}
