
import java.util.Scanner;

/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente
 * secuencia: 5/10 10/12 15/14 20/16 25/18 30/20
 *
 * @author sebas
 */
public class Ejercicio2_secuencia2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int numerador = 5,contador = 0;
        int limite;
        int denominador = 10;
        System.out.print("Dame el límite: ");
        limite = sca.nextInt();
        while (contador <= limite) {
            System.out.print(numerador + "/" + denominador + ", ");
            numerador += 5;
            denominador += 2;
            contador++;
            
        }
        System.out.println("");
    }
}
/***
 * run:
Dame el límite: 6
5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 35/22, 
BUILD SUCCESSFUL (total time: 1 second)
 */
