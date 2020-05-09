package inicioApp;

import static inicioApp.inicioApp.arrayLetrasRepetidas;
import static inicioApp.inicioApp.contadorVecesRepetida;

/*
 * Esta clase lo que hara sera pasar al metodo main lo que tiene que escribir por pantalla.
 * @author Roberto
 * @version 1.0
 */
public class PintarResultado extends ContarPalabras {

    /*
     * Este metodo lo que hara sera pintar la frase de cuantos caracteres hay en total.
     * @param ContadorCaracteres
     * @return "Hay un total de " + ContadorCaracteres + " caracteres."
     */
    static String textoCaracterTotal(int ContadorCaracteres) {
        return "Hay un total de " + ContadorCaracteres + " caracteres.";
    } //ContadorCaracteres

    /*
     * Este metodo lo que hara sera pintar la frase de cuantos espacios hay en total.
     * @param ContadorEspacios
     * @return "Hay un total de " + ContadorEspacios + " palabras"
     */
    static String textoNumeroPalabras(int ContadorEspacios) {
        return "Hay un total de " + ContadorEspacios + " palabras";
    } //ContadorEspacios

    /*
     * Este metodo lo que hara sera pintar las veces que se repite cada letra hasta el final de la frase.
     * @param i
     * @return "La letra " + arrayLetrasRepetidas[i] + " se repite " + contadorVecesRepetida[i]
     */
    static String textoTodosCaracteres(int i) {
        return "La letra " + arrayLetrasRepetidas[i] + " se repite " + contadorVecesRepetida[i];
    }
    
}
