import static org.junit.Assert.*;

import org.junit.Test;

public class Tragabolas2Test {

	@Test
	public void testComer1() throws InterruptedException {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 0, 10, 1);
		Integer comodin = 10;
		Boolean resultado = Tragabolas2.comer(bolas, comodin);
		assertEquals(true, resultado);
	}

	@Test
	public void testComer2() throws InterruptedException {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 0, 10, 1);
		Integer comodin = 11;
		Boolean resultado = Tragabolas2.comer(bolas, comodin);
		assertEquals(false, resultado);
	}

	@Test
	public void testTrotar1() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 0, 10, 1);
		Boolean resultado = Tragabolas2.trotar(bolas);
		assertEquals(false, resultado);
	}

	@Test
	public void testTrotar2() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 2, 10, 1);
		Boolean resultado = Tragabolas2.trotar(bolas);
		assertEquals(true, resultado);
	}

	@Test
	public void testDormir1() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 10, 10, 1);
		Boolean resultado = Tragabolas2.dormir(bolas);
		assertEquals(true, resultado);
	}

	@Test
	public void testDormir2() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.dormir(bolas);
		assertEquals(false, resultado);
	}

	@Test
	public void testVerificadorCol1() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.verificadorCol("azul");
		assertEquals(true, resultado);
	}

	@Test
	public void testVerificadorCol2() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.verificadorCol("amarillo");
		assertEquals(true, resultado);
	}

	@Test
	public void testVerificadorCol3() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.verificadorCol("rojo");
		assertEquals(true, resultado);
	}

	@Test
	public void testVerificadorCol4() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.verificadorCol("verde");
		assertEquals(true, resultado);
	}

	@Test
	public void testVerificadorCol5() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.verificadorCol("blanco");
		assertEquals(false, resultado);
	}

	@Test
	public void testVerificadorMax1() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.verificadorMax(20);
		assertEquals(true, resultado);
	}
	@Test
	public void testVerificadorMax2() {
		Tragabolas2 comerbolas = null;
		Bolas bolas = new Bolas(" ", 5, 10, 1);
		Boolean resultado = Tragabolas2.verificadorMax(0);
		assertEquals(false, resultado);
	}
}
