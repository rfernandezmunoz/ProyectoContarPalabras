package inicioApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContarPalabrasTest {

	@Test
	void test() {
		assertFalse(ContarPalabras.contarCaracteresTotal("Hola")==5);
		assertTrue(ContarPalabras.contarCaracteresTotal("palabra")==7);
		assertFalse(ContarPalabras.contarNumeroPalabras("Cadena")==4);
		assertTrue(ContarPalabras.contarNumeroPalabras("mesa")==1);
	}

}
