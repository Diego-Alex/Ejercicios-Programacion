import static org.junit.Assert.*;

import org.junit.Test;

public class metodosTest {

	@Test
	public void testMetodo1() {
		metodos prueba1 = new metodos();
		boolean a= true, b= true;
		int result = prueba1.metodo(a, b);
		assertEquals(1, result);
	}

	@Test
	public void testMetodo2() {
		metodos prueba1 = new metodos();
		boolean a= true, b= false;
		int result = prueba1.metodo(a, b);
		assertEquals(2, result);
	}

	@Test
	public void testMetodo3() {
		metodos prueba1 = new metodos();
		boolean a= false, b= true;
		int result = prueba1.metodo(a, b);
		assertEquals(2, result);
	}

	@Test
	public void testContar_letra1() {
		metodos prueba2 = new metodos();
		String cadena, letra;
		cadena = "";
		letra = "a";
		int result = prueba2.contar_letra(cadena, letra);
		assertEquals(0, result);
	}

	@Test
	public void testContar_letra2() {
		metodos prueba2 = new metodos();
		String cadena, letra;
		cadena = "r";
		letra = "a";
		int result = prueba2.contar_letra(cadena, letra);
		assertEquals(0, result);
	}

	@Test
	public void testContar_letra3() {
		metodos prueba2 = new metodos();
		String cadena, letra;
		cadena = "a";
		letra = "a";
		int result = prueba2.contar_letra(cadena, letra);
		assertEquals(1, result);
	}

	@Test
	public void testContar_letra4() {
		metodos prueba2 = new metodos();
		String cadena, letra;
		cadena = "patata";
		letra = "a";
		int result = prueba2.contar_letra(cadena, letra);
		assertEquals(3, result);
	}

	@Test
	public void testcod_Area1() {
		metodos prueba3 = new metodos();
		String cadena;
		cadena = "hola334";
		boolean result = prueba3.cod_Area(cadena);
		assertFalse(result);
	}

	@Test
	public void testcod_Area2() {
		metodos prueba3 = new metodos();
		String cadena;
		cadena = "254";
		boolean result = prueba3.cod_Area(cadena);
		assertTrue(result);
	}

	@Test
	public void testcod_Area3() {
		metodos prueba3 = new metodos();
		String cadena;
		cadena = "199";
		boolean result = prueba3.cod_Area(cadena);
		assertFalse(result);
	}

	@Test
	public void testcod_Area4() {
		metodos prueba3 = new metodos();
		String cadena;
		cadena = "1000";
		boolean result = prueba3.cod_Area(cadena);
		assertFalse(result);
	}

	@Test
	public void testcont_caracteres1() {
		metodos prueba4 = new metodos();
		String cadena;
		cadena = "55555";
		boolean result = prueba4.cont_caracteres(cadena);
		assertFalse(result);
	}

	@Test
	public void testcont_caracteres2() {
		metodos prueba4 = new metodos();
		String cadena;
		cadena = "666666";
		boolean result = prueba4.cont_caracteres(cadena);
		assertTrue(result);
	}

	@Test
	public void testcont_caracteres3() {
		metodos prueba4 = new metodos();
		String cadena;
		cadena = "7777777";
		boolean result = prueba4.cont_caracteres(cadena);
		assertFalse(result);
	}

	@Test
	public void testverificador1() {
		metodos prueba5 = new metodos();
		String cadena;
		cadena = "cheque";
		boolean result = prueba5.verificador(cadena);
		assertTrue(result);
	}

	@Test
	public void testverificador2() {
		metodos prueba5 = new metodos();
		String cadena;
		cadena = "depósito";
		boolean result = prueba5.verificador(cadena);
		assertTrue(result);
	}

	@Test
	public void testverificador3() {
		metodos prueba5 = new metodos();
		String cadena;
		cadena = "pago factura";
		boolean result = prueba5.verificador(cadena);
		assertTrue(result);
	}

	@Test
	public void testverificador4() {
		metodos prueba5 = new metodos();
		String cadena;
		cadena = "retirada de fondos";
		boolean result = prueba5.verificador(cadena);
		assertTrue(result);
	}

	@Test
	public void testverificador5() {
		metodos prueba5 = new metodos();
		String cadena;
		cadena = "hola";
		boolean result = prueba5.verificador(cadena);
		assertFalse(result);
	}
}
