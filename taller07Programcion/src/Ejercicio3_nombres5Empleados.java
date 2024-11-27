
import java.util.Scanner;

/**
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
Nombre 2	11	$2	$22
Nombre 3	9	$3	$27
Nombre 4	5	$4	$20
Nombre 5	12	$2	$24
 * @author sebas
 */
public class Ejercicio3_nombres5Empleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] diasTrabajados = new int[5];
        double[] costoPorDia = new double[5];
        double[] totalCancelar = new double[5];

        int i = 0; 
        while (i < 5) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese el número de días trabajados por " + nombres[i] + ": ");
            diasTrabajados[i] = scanner.nextInt();

            System.out.println("Ingrese el costo por día de trabajo de " + nombres[i] + ": ");
            costoPorDia[i] = scanner.nextDouble();
            scanner.nextLine(); 
            totalCancelar[i] = diasTrabajados[i] * costoPorDia[i];
            i++; 
        }

        System.out.println("\nREPORTE:");
        System.out.println("Nombre\t\tDías\tCosto/Día\tTotal");
        i = 0; 
        while (i < 5) {
            System.out.printf("%s\t\t%d\t$%.2f\t\t$%.2f\n", 
                nombres[i], diasTrabajados[i], costoPorDia[i], totalCancelar[i]);
            i++;
        }
    }
}
/**
 * REPORTE:
Nombre		Días	Costo/Día	Total
Jose		10	$2,50		$25,00
Carlos		11	$2,00		$22,00
Pedro		9	$3,00		$27,00
Mario		5	$4,00		$20,00
Juan		12	$2,00		$24,00
BUILD SUCCESSFUL (total time: 42 seconds)
 */
        

