package inicioApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PintarResultadoTest {

	@Test
	void test() {
		int i = 5;
		assertFalse(PintarResultado.textoTodosCaracteres(i)=="cinco");
		assertTrue(PintarResultado.textoTodosCaracteres(i)=="cuatro");
	}

}
