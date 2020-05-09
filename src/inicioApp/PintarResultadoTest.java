package inicioApp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Roberto
 * version 1.0
 * Hago esta prueba de test para saber si los valores se introducen bien en el programa y si el resultado a la hora
 * de pintar es bueno.
 */
class PintarResultadoTest {

	@Test
/**
 * Hago una prueba de si es verdadero o falso en dos metodos de la clase Pintar Resultado. Estos dos metodos estan bien
 * ya que a la hora de pintar es el mismo resultado.
 */
	void test() {
		int ContadorCaracteres = 6;
		int ContadorEspacios = 3;
		assertTrue(PintarResultado.textoCaracterTotal(ContadorCaracteres)=="Hay un total de 6 caracteres.");
		assertFalse(PintarResultado.textoCaracterTotal(ContadorCaracteres)=="Hay un total de 8 caracteres.");
		assertTrue(PintarResultado.textoNumeroPalabras(ContadorEspacios)=="Hay un total de 4 palabras");
		assertFalse(PintarResultado.textoNumeroPalabras(ContadorEspacios)=="Hay un total de 3 palabras");
		
	}
}