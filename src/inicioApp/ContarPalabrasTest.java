package inicioApp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author Roberto
 * version 1.0
 * Lo que hago en esta prueba sera saber si el programa cuenta bien los caracteres y espacios de ambos metodos.
 */
class ContarPalabrasTest {

	@Test
/**
 * Hago ambas pruebas con los dos metodos siguientes y se puede observar como estarian bien a la hora de contar
 * caracteres y a la hora de contar el numero de palabras.
 */
	void test() {
		String Cadena ="Hola que tal";
		assertTrue(ContarPalabras.contarCaracteresTotal(Cadena)==10);
		assertFalse(ContarPalabras.contarCaracteresTotal(Cadena)==5);
		assertTrue(ContarPalabras.contarNumeroPalabras(Cadena)==3);
		assertFalse(ContarPalabras.contarNumeroPalabras(Cadena)==5);
	}

}
