package inicioApp;

import static inicioApp.inicioApp.ContadorCaracteres;
import static inicioApp.inicioApp.ContadorEspacios;
import static inicioApp.inicioApp.arrayLetrasRepetidas;
import static inicioApp.inicioApp.contadorVecesRepetida;

public class ContarPalabras {

    static int contarCaracteresTotal(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            if (Cadena.charAt(i) != ' ') {
                ContadorCaracteres++;
            }
        }
        return ContadorCaracteres;
    } //contarCaracteresTotal

    static int contarNumeroPalabras(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            if (Cadena.charAt(i) == ' ') {
                ContadorEspacios++;
            }
        }
        return ContadorEspacios;
    } //contarNumeroPalabras

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
