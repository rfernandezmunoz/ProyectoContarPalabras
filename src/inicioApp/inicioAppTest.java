package inicioApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class inicioAppTest {

	@Test
	void test() {
		String Cadena = "Hola que tal";
		assertTrue(inicioApp.contadorVecesRepetida(Cadena)==Cadena.length());
	}



}
