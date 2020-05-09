package inicioApp;

import static inicioApp.inicioApp.ContadorCaracteres;
import static inicioApp.inicioApp.ContadorEspacios;
import static inicioApp.inicioApp.arrayLetrasRepetidas;
import static inicioApp.inicioApp.contadorVecesRepetida;

/*
 * Esta clase contiene todas las acciones que se necesitan para poder contar las palabras, caracteres y 
 * cuantos caracteres se repiten.
 * @author Roberto
 * @version 1.0
 */
public class ContarPalabras {
	
    /*
     * Este metodo lo que hace sera contar cuantos caracteres hay en total en toda la cadena que le hemos
     * indicado en el metodo main.
     * @param Cadena
     * @return ContadorCaracteres
     */
    static int contarCaracteresTotal(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            if (Cadena.charAt(i) != ' ') {
                ContadorCaracteres++;
            }
        }
        return ContadorCaracteres;
    } //contarCaracteresTotal
    
    /*
     * En este metodo lo que haremos sera contar los espacios que tenemos en la cadena de texto pasada en 
     * el metodo main. Este metodo lo podremos incluir en el metodo anterior, pero se puede dejar asi para
     * poder diferenciarlo.
     * @param Cadena
     * @return ContadorEspacios
     */
    static int contarNumeroPalabras(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            if (Cadena.charAt(i) == ' ') {
                ContadorEspacios++;
            }
        }
        return ContadorEspacios;
    } //contarNumeroPalabras
    
    /*
     * Este metodo lo que hara sera contar los caracteres que se repiten, y los guardara en un array de int.
     * @param Cadena
     * @return contadorVecesRepetida
     */
    static int[] contarTodosCaracteres(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            char letraActual = Cadena.charAt(i);
            boolean letraEncontrada = false;
            int j = 0;
            while (j < arrayLetrasRepetidas.length && letraEncontrada == false) {
                //Inserto en el array la letra e inicializo el contadorVeces Repetida
                if (letraEncontrada == false && contadorVecesRepetida[j] == 0) {
                    arrayLetrasRepetidas[j] = letraActual;
                    contadorVecesRepetida[j]++;
                    letraEncontrada = true;
                } else {
                    //Búsqueda de una letra en una array
                    if (letraActual == arrayLetrasRepetidas[j]) {
                        contadorVecesRepetida[j]++;
                        letraEncontrada = true;
                    }
                }
                j++;
            }
        }
        return contadorVecesRepetida;
    } //contarTodosCaracteres
    
}
