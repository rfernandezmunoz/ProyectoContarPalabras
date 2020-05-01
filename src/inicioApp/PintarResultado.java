package inicioApp;

import static inicioApp.inicioApp.arrayLetrasRepetidas;
import static inicioApp.inicioApp.contadorVecesRepetida;

public class PintarResultado extends ContarPalabras {

    static String textoCaracterTotal(int ContadorCaracteres) {
        return "Hay un total de " + ContadorCaracteres + " caracteres.";
    } //ContadorCaracteres

    static String textoNumeroPalabras(int ContadorEspacios) {
        return "Hay un total de " + ContadorEspacios + " palabras";
    } //ContadorEspacios

    static String textoTodosCaracteres(int i) {
        return "La letra " + arrayLetrasRepetidas[i] + " se repite " + contadorVecesRepetida[i];
    }
    
}
