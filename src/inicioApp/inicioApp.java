package inicioApp;
import java.util.Scanner;
public class inicioApp extends PintarResultado {
	static int ContadorCaracteres=0;
	static int ContadorEspacios=1;
        static int [] contadorVecesRepetida;
        static char[] arrayLetrasRepetidas;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica una frase: ");
		String Cadena = sc.nextLine();
                
                contadorVecesRepetida = new int[Cadena.length()];
                arrayLetrasRepetidas = new char[Cadena.length()];
                
		int TotalCaracteres = contarCaracteresTotal(Cadena);
                int TotalPalabras = contarNumeroPalabras(Cadena);
                contarTodosCaracteres(Cadena);
                
                System.out.println(textoCaracterTotal(TotalCaracteres));
                System.out.println(textoNumeroPalabras(TotalPalabras));
                for(int i=0;i<contadorVecesRepetida.length;i++){
                    if(contadorVecesRepetida[i] >=1 && arrayLetrasRepetidas[i] != ' '){
                        System.out.println(textoTodosCaracteres(i));
                    }
                }
                
        }//MAIN
}