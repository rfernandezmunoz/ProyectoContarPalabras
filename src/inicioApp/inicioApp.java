package inicioApp;
import java.util.Scanner;
public class inicioApp {
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
	
        static int contarCaracteresTotal(String Cadena){
            for(int i=0;i<Cadena.length();i++) {
                if(Cadena.charAt(i)!= ' ')
				ContadorCaracteres++;
            }
            return ContadorCaracteres;
        }//contarCaracteresTotal
	
        static int contarNumeroPalabras(String Cadena){
            for(int i=0;i<Cadena.length();i++) {
		if(Cadena.charAt(i)== ' ')
                    ContadorEspacios++;
            }
            return ContadorEspacios;
        }//contarNumeroPalabras
        
        static int[] contarTodosCaracteres(String Cadena){
            for(int i=0;i<Cadena.length();i++) {
		char letraActual = Cadena.charAt(i);
		boolean letraEncontrada = false;
		int j = 0;
		while(j<arrayLetrasRepetidas.length && letraEncontrada == false) {
                    //Inserto en el array la letra e inicializo el contadorVeces Repetida
                    if (letraEncontrada == false && contadorVecesRepetida[j]==0) {
			arrayLetrasRepetidas[j]= letraActual;
			contadorVecesRepetida[j]++;
			letraEncontrada = true;
                    }
                    else{
                    //Búsqueda de una letra en una array
                        if(letraActual == arrayLetrasRepetidas[j]) {
                            contadorVecesRepetida[j]++;
                            letraEncontrada = true;
			}
                    }
                    j++;
		}
            }
            return contadorVecesRepetida;
        }//contarTodosCaracteres
        
        static String textoCaracterTotal(int ContadorCaracteres){
            return "Hay un total de "+ContadorCaracteres+" caracteres.";
        }//ContadorCaracteres	
        
        static String textoNumeroPalabras(int ContadorEspacios){
            return "Hay un total de "+ContadorEspacios+" palabras";
        }//ContadorEspacios
        
        static String textoTodosCaracteres(int i){
            return "La letra "+arrayLetrasRepetidas[i]+" se repite "+contadorVecesRepetida[i];
        }
}