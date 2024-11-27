
import java.util.Scanner;

/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 	1/10
	2/11
	3/12
	4/13
	5/14
	6/15
 * @author sebas
 */
public class Ejercicio1_secuencia1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        int contador = 1, limite;
        System.out.print("Dame el límite: ");
        limite = sca.nextInt();
        while(contador <= limite){
            System.out.print(contador + "/" + (contador + 9) + ", ");
            contador++;
        }
        System.out.println("");
    }
    
}
/***
 * Dame el límite: 10
1/10, 2/11, 3/12, 4/13, 5/14, 6/15, 7/16, 8/17, 9/18, 10/19, 
BUILD SUCCESSFUL (total time: 2 seconds)
 */
